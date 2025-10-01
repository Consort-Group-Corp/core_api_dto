package uz.consortgroup.core.api.v1.dto.webinar.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import uz.consortgroup.core.api.v1.dto.webinar.core.EmailOrPinfl;


import java.util.regex.Pattern;

public class EmailOrPinflValidator implements ConstraintValidator<EmailOrPinfl, String> {
    private static final Pattern EMAIL =
        Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern PINFL = Pattern.compile("^\\d{14}$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext ctx) {
        if (value == null || value.isBlank()) return false;
        return EMAIL.matcher(value).matches() || PINFL.matcher(value).matches();
    }
}
