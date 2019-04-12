package com.amanganiello90.application.models;

public class MessageTO {

	private String id;
	private String message;

	public MessageTO() {

	}

	public MessageTO(String id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
