package com.walden.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mail", schema = "goturf")
public class TurfMail implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String mail_id;
    private String mail_host;
	private String mail_send;
	private String use_name;
	private String use_pass;
	private String subject;
	private String message;
	

	@Id
    @Column(name = "mail_id")
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	
	@Column(name = "mail_host")
	public String getMail_host() {
		return mail_host;
	}
	public void setMail_host(String mail_host) {
		this.mail_host = mail_host;
	}
	
	@Column(name = "mail_send")
	public String getMail_send() {
		return mail_send;
	}
	public void setMail_send(String mail_send) {
		this.mail_send = mail_send;
	}
	
	@Column(name = "use_name")
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	
	@Column(name = "use_pass")
	public String getUse_pass() {
		return use_pass;
	}
	public void setUse_pass(String use_pass) {
		this.use_pass = use_pass;
	}

	
	@Column(name = "subject")
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Column(name = "message")
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
