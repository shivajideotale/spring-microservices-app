package app.common.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ErrorDTO {

	private HttpStatus status;
	private String error;
	private List<FieldErrorDTO> errors = new ArrayList<FieldErrorDTO>();

	public ErrorDTO(HttpStatus status, String error) {
		super();
		this.status = status;
		this.error = error;
	}

	public ErrorDTO(HttpStatus status, String error, List<FieldErrorDTO> errors) {
		super();
		this.status = status;
		this.error = error;
		this.errors = errors;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public String getError() {
		return error;
	}

	public List<FieldErrorDTO> getErrors() {
		return errors;
	}

}
