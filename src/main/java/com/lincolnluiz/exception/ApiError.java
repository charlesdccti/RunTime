package com.lincolnluiz.exception;

import java.util.ArrayList;
import java.util.List;

public class ApiError {

	private List<ApiErrorMessage> messages;
	
	public List<ApiErrorMessage> getMessages() {
		return messages;
	}
	public void addMessage(String titulo, String texto) {
		if (this.messages == null) this.messages = new ArrayList<ApiErrorMessage>();
		
		ApiErrorMessage apiErrorMessage = new ApiErrorMessage();
		apiErrorMessage.setTitle(titulo);
		apiErrorMessage.setMessage(texto);
		
		this.messages.add(apiErrorMessage);
	}
	
}
