package com.jorge.wsmongo.resource.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jorge.wsmongo.services.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResoureceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		
		HttpStatus status  = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(System.currentTimeMillis(), 
												status.value(), 
											    "Não encontrado",
											    e.getMessage() , 
											    request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
