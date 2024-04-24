package com.alain.evaluacion.smartjob.bci.bcitest.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = PasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })

public @interface PasswordIsValid {
    String message() default "es requerido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}