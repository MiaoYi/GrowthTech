package org.growthTech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.growthTech.wechat.service.CoreService;
import org.growthTech.wechat.util.SignUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class WeChatServiceController {
	@Autowired
	CoreService coreService;
	
	/** 
     * ȷ����������΢�ŷ����� 
     */  
	@RequestMapping(value = "/weChatService", method = RequestMethod.GET) 
	@ResponseBody
	 public String connectWeChat( @RequestParam("signature") String signature, @RequestParam("timestamp") String timestamp, @RequestParam("nonce") String nonce, @RequestParam("echostr") String echostr) {
		// ͨ������signature���������У�飬��У��ɹ���ԭ������echostr����ʾ����ɹ����������ʧ��  
	    if (SignUtil.checkSignature(signature, timestamp, nonce)) {  
	    	return echostr;  
	    }  
	    else {
	        return null;
	    }
	}
	
	/** 
     * ����΢�ŷ�������������Ϣ 
     */ 
	@RequestMapping(value = "/weChatService", method = RequestMethod.POST) 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        // TODO ��Ϣ�Ľ��ա�������Ӧ  
    	// ��������Ӧ�ı��������ΪUTF-8����ֹ�������룩  
        request.setCharacterEncoding("UTF-8");  
        response.setCharacterEncoding("UTF-8");  
  
        // ���ú���ҵ���������Ϣ��������Ϣ  
        String respMessage = coreService.processRequest(request);  
          
        // ��Ӧ��Ϣ  
        PrintWriter out = response.getWriter();  
        out.print(respMessage);  
        out.close();  
    }    

}
