package uz.consortgroup.core.api.v1.dto.webinar.core;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import uz.consortgroup.core.api.v1.dto.webinar.validator.EmailOrPinflValidator;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE_USE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailOrPinflValidator.class)
public @interface EmailOrPinfl {
    String message() default "Value must be a valid email or 14-digit PINFL";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}