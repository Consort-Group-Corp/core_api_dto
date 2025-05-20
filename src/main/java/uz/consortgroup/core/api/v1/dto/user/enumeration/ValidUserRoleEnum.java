package uz.consortgroup.core.api.v1.dto.user.enumeration;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = UserRoleEnumValidator.class)
public @interface ValidUserRoleEnum {
    String message() default "Invalid value for enum";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    Class<? extends Enum<?>> enumClass();
}
