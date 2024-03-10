package com.nt.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
public @interface ValidAge {
	String message() default "Invalid age";

	int min() default 18;

	int max() default 60;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
