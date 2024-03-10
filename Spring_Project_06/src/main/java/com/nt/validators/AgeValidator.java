package com.nt.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<ValidAge, Integer> {

    private int min;	
    private int max;

    @Override
    public void initialize(ValidAge constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {
        return age == null || (age >= min && age <= max);
    }
}
