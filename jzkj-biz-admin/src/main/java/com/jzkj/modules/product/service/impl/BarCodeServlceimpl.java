package com.jzkj.modules.product.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.com.jzkj.miservice.entity.Barcode.SysBarcode;
import com.jzkj.common.annotation.DataFilter;
import com.jzkj.common.utils.Constant;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.modules.product.dao.SysBarcodeDao;
import com.jzkj.modules.product.service.BarCodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("BarCodeService")
public class BarCodeServlceimpl extends ServiceImpl<SysBarcodeDao, SysBarcode> implements BarCodeService {
@Resource
    private SysBarcodeDao sysBarcodeDao;

@DataFilter(subDept = true, user = false)
public PageUtils queryPage(Map<String, Object> params) {
    Page<SysBarcode> page = this.selectPage(
            new Query<SysBarcode>(params).getPage(),
            new EntityWrapper<SysBarcode>()
                    .addFilterIfNeed(params.get(Constant.SQL_FILTER) != null, (String)params.get(Constant.SQL_FILTER))
    );
    return new PageUtils(page);
}

    @Override
    public void deleteByids(int i) {
        this.sysBarcodeDao.deleteById(i);
    }


}
