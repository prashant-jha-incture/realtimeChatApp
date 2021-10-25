package com.realtimechat.app.realtimeChatApp.DTO;

public class MessageDTO {
	
	private String name;
	
	private String content;

	public MessageDTO(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}

	public MessageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "MessageDTO [name=" + name + ", content=" + content + "]";
	}
	
	

}
