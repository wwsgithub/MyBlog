package com.example.blog.entity;

import java.sql.Date;

/**
 * 日志实体类
 * @author 26046
 *
 */
public class BlogEntity {

	private Integer id;
	private String title;
	private String content;
	private Date sendDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	@Override
	public String toString() {
		return "BlogEntity [id=" + id + ", title=" + title + ", content=" + content + ", sendDate=" + sendDate + "]";
	}
}
