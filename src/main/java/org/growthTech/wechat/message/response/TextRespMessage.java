package org.growthTech.wechat.message.response;  
  
/** 
 * 文本消息 
 *  
 * @author liufeng 
 * @date 2013-05-19 
 */  
public class TextRespMessage extends BaseRespMessage {  
    // 回复的消息内容  
    private String Content;  
  
    public String getContent() {  
        return Content;  
    }  
  
    public void setContent(String content) {  
        Content = content;  
    }  
}  