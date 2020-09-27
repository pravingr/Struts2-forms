package com.pgrdevelopers.strutsforms.validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class DomainNameValidator extends FieldValidatorSupport{

	@Override
	public void validate(Object obj) throws ValidationException {
		// TODO Auto-generated method stub
		System.out.println("Inside email domain validator");
		String domain = "gmail.com";
		String fieldName = getFieldName();
		String email = (String)getFieldValue(fieldName,obj);
		
		if(!email.endsWith(domain)) {
			addFieldError(fieldName,obj);
		}
	}

}
