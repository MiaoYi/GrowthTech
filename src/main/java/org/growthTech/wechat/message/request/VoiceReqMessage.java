package org.growthTech.wechat.message.request;  
  
/** 
 * ��Ƶ��Ϣ 
 *  
 * @author liufeng 
 * @date 2013-05-19 
 */  
public class VoiceReqMessage extends BaseReqMessage {  
    // ý��ID  
    private String MediaId;  
    // ������ʽ  
    private String Format;  
  
    public String getMediaId() {  
        return MediaId;  
    }  
  
    public void setMediaId(String mediaId) {  
        MediaId = mediaId;  
    }  
  
    public String getFormat() {  
        return Format;  
    }  
  
    public void setFormat(String format) {  
        Format = format;  
    }  
}  