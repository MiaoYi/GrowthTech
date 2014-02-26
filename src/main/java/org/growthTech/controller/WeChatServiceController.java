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
     * 确认请求来自微信服务器 
     */  
	@RequestMapping(value = "/weChatService", method = RequestMethod.GET) 
	@ResponseBody
	 public String connectWeChat( @RequestParam("signature") String signature, @RequestParam("timestamp") String timestamp, @RequestParam("nonce") String nonce, @RequestParam("echostr") String echostr) {
		// 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败  
	    if (SignUtil.checkSignature(signature, timestamp, nonce)) {  
	    	return echostr;  
	    }  
	    else {
	        return null;
	    }
	}
	
	/** 
     * 处理微信服务器发来的消息 
     */ 
	@RequestMapping(value = "/weChatService", method = RequestMethod.POST) 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        // TODO 消息的接收、处理、响应  
    	// 将请求、响应的编码均设置为UTF-8（防止中文乱码）  
        request.setCharacterEncoding("UTF-8");  
        response.setCharacterEncoding("UTF-8");  
  
        // 调用核心业务类接收消息、处理消息  
        String respMessage = coreService.processRequest(request);  
          
        // 响应消息  
        PrintWriter out = response.getWriter();  
        out.print(respMessage);  
        out.close();  
    }    

}
