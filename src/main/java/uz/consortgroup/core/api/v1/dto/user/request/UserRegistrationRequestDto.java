package uz.consortgroup.core.api.v1.dto.user.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "UserRegistrationRequest", description = "Данные для регистрации пользователя")
public class UserRegistrationRequestDto {

    @Schema(description = "Язык интерфейса пользователя", example = "ru",
            allowableValues = {"ru","uz","uzk","en"})
    @NotNull(message = "Language is required")
    private Language language;

    @Schema(description = "Email для входа", example = "user@example.com")
    @Email @NotBlank(message = "Email is required")
    private String email;

    @Schema(description = "Пароль (мин. 8 символов, цифра, строчная и заглавная буква)", example = "Abcdef12")
    @Size(min = 8, max = 100, message = "Password must be between 8 and 100 characters")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$",
            message = "Password must contain at least one digit, one lowercase letter, and one uppercase letter")
    @NotBlank(message = "Password is required")
    private String password;
}
