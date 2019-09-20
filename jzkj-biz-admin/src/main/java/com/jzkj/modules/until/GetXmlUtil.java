package com.jzkj.modules.until;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

public class GetXmlUtil {

	//获得所有的节点
	public static Map<String,Object> getxml(String str){
		Map<String,Object> map=new HashMap<>();
		//创建一个新的字符串
        StringReader read = new StringReader(str);
        //创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
        InputSource source = new InputSource(read);
        //创建一个新的SAXBuilder
        SAXBuilder sb = new SAXBuilder();

		try {
			//通过输入源构造一个Document
			Document doc = sb.build(source);
			
			Element root = doc.getRootElement();
            //得到根元素所有子元素的集合
			List jiedian = root.getChildren();
			map.put("flag",true);
			map.put("list",jiedian);
		} catch (JDOMException e) {
			String[] split = e.getMessage().split(":");
			map.put("flag",false);
			map.put("msg",split[split.length-1]);
		} catch (IOException e) {
			String message = e.getMessage();
			map.put("flag",false);
			map.put("msg",message);
		}
        //取的根元素
		return map;

	}

}
