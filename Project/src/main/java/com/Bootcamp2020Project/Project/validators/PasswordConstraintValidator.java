package com.Bootcamp2020Project.Project.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword,String> {
@Override
public void initialize(ValidPassword constraintAnnotation) {

        }

@Override
public boolean isValid(String value, ConstraintValidatorContext context) {

        return false;
        }
        }

