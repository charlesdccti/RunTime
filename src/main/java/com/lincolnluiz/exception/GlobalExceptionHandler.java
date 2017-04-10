package com.lincolnluiz.exception;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Throwables;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = RuntimeException.class)
	public @ResponseBody ApiError handleException(RuntimeException ex) {
		ex.printStackTrace();
		
		ApiError error = new ApiError();
		error.addMessage(ex.getMessage(), Throwables.getStackTraceAsString(ex));
		
		return error;
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = ConstraintViolationException.class)
	public @ResponseBody ApiError handleException(ConstraintViolationException ex) {
		
		ApiError error = new ApiError();
		
		//for (ConstraintViolationException constraintViolationException : ex.getConstraintViolations())
//		error.setMessage(ex.getMessage());
		
		return error;
	}
	
	@ResponseStatus(HttpStatus.FORBIDDEN)
	@ExceptionHandler(value = AccessDeniedException.class)
	public @ResponseBody ApiError handleException(AccessDeniedException ex) {
		
		ApiError error = new ApiError();
//		error.setMessage(ex.getMessage());
		
		return error;
	}
	
}
