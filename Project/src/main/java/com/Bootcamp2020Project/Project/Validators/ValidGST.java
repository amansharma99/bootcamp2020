package com.Bootcamp2020Project.Project.Validators;
import javax.validation.Payload;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
public @interface ValidGST {

    String message()  default "Invalid GST";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default{};
}