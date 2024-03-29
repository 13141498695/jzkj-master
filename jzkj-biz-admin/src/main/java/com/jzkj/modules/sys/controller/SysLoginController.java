package com.jzkj.modules.sys.controller;


import cn.hutool.core.util.ObjectUtil;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.modules.sys.entity.SysUserEntity;
import com.jzkj.modules.sys.shiro.ShiroUtils;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Collection;

/**
 * 登录相关
 *
 * @author
 * @email
 * @date
 */
@Controller
public class SysLoginController {
	@Autowired
	private Producer producer;

	@RequestMapping("captcha.jpg")
	public void captcha(HttpServletResponse response)throws IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到shiro session
        ShiroUtils.setSessionAttribute(Constants.KAPTCHA_SESSION_KEY, text);

        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
	}

	/**
	 * 登录
	 */
	@ResponseBody
	@RequestMapping(value = "/sys/login", method = RequestMethod.POST)
	public ReturnResult login(String username, String password, String captcha, HttpServletRequest request) {
		String kaptcha = ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);
		if(!captcha.equalsIgnoreCase(kaptcha)){
			return ReturnResult.error("验证码不正确");
		}

		try{
			Subject subject = ShiroUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			subject.login(token);
            request.setAttribute("username",username);
		}catch (UnknownAccountException e) {
			return ReturnResult.error(e.getMessage());
		}catch (IncorrectCredentialsException e) {
			return ReturnResult.error("账号或密码不正确");
		}catch (LockedAccountException e) {
			return ReturnResult.error("账号已被锁定,请联系管理员");
		}catch (AuthenticationException e) {
			return ReturnResult.error("账户验证失败");
		}

		return ReturnResult.ok();
	}


//
//    /**
//     * 社交登录
//     *
//     * @param userId
//     * @return
//     * @throws UsernameNotFoundException
//     */
//    @Override
//    public SocialUserDetails loadUserByUserId(String userId) throws UsernameNotFoundException {
//        SysUserEntity sysUser = new SysUserEntity();
//        sysUser.setUserId(Integer.valueOf(userId));
//        //根据用户名查找用户信息
//        SysUser user = userService.findSecurityUserByUser(sysUser);
//        if (ObjectUtil.isNull(user)) {
//            log.info("社交登录userId:" + userId);
//            throw new UsernameNotFoundException("社交登录userId：" + userId + " 不存在");
//        }
//        Collection<? extends GrantedAuthority> authorities = getUserAuthorities(user.getUserId());
//        return new PreSocialUser(user.getUserId(), user.getUsername(), user.getPassword(), authorities);
//    }
//
//



	/**
	 * 退出
	 */
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout() {
		ShiroUtils.logout();
		return "redirect:login.html";
	}

}
