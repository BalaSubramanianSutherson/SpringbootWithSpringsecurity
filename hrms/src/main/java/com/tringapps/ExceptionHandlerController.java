package com.tringapps;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
	
@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		return new ResponseEntity<>(" HRMS " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
