package org.growthTech.entity;

import java.sql.Date;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Card {
	private int id;
	private int teacherId;
	private String title;
	private String author;
	private String summary;
	private CommonsMultipartFile cover;
	private String content;
	private String originalLink;
	private Date createTime;
	private Date sendTime;
	private int isSent;
	
	public Card() {
		super();
	}
	
	public Card(int id, int teacherId, String title, String author, String summary, String content, String originalLink, Date createTime, Date sendTime, int isSent) {
		this.id = id;
		this.teacherId = teacherId;
		this.title = title;
		this.author = author;
		this.summary = summary;
		this.content = content;
		this.originalLink = originalLink;
		this.createTime = createTime;
		this.sendTime = sendTime;
		this.isSent = isSent;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public CommonsMultipartFile getCover() {
		return cover;
	}
	public void setCover(CommonsMultipartFile cover) {
		this.cover = cover;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public int getIsSent() {
		return isSent;
	}
	public void setIsSent(int isSent) {
		this.isSent = isSent;
	}
	public String getOriginalLink() {
		return originalLink;
	}
	public void setOriginalLink(String originalLink) {
		this.originalLink = originalLink;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


}
