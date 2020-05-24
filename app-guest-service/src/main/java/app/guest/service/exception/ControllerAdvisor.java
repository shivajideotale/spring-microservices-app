package app.guest.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import app.common.dto.ErrorDTO;
import app.common.exception.FieldException;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
	
	
	public ControllerAdvisor() {
		System.out.println("inside ControllerAdvisor...........");
	}
	

	@ResponseBody
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(FieldException.class)
	public ErrorDTO handleFieldException(FieldException exception) {
		System.out.println("inside UserExceptionHandler....................");
		ErrorDTO errorDTO = new ErrorDTO(HttpStatus.BAD_REQUEST, "Bad Request");
		return errorDTO;

	}
}
