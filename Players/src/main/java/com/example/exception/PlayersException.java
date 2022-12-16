package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PlayersException {
	@ExceptionHandler(value = PlayersNotFountException.class)
		public ResponseEntity<Object> exception(PlayersNotFountException exception){
			return new ResponseEntity<>("Players Not Found",HttpStatus.NOT_FOUND);
		
	} 
}
