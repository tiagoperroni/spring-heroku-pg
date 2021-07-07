package com.tiagoperroni.course.services.exceptions;

public class ResourceNotFoundExcetption extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExcetption(Object id) {
		super("Resource not found. Id " + id);
	}

}
