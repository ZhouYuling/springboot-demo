package com.gzhc365.exception;


import com.gzhc365.enums.ApiExceptionCode;

public class ResourceNotFoundException extends ApiException{
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String msg) {
		super(ApiExceptionCode.RESOURCE_NOT_FOUND.getValue(), msg);
	}

}
