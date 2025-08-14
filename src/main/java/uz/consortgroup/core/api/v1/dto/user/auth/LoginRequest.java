package uz.consortgroup.core.api.v1.dto.user.auth;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.deserializer.LanguageDeserializer;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "LoginRequest", description = "Запрос на авторизацию пользователя")
public class LoginRequest {

    @JsonDeserialize(using = LanguageDeserializer.class)
    @Schema(
            description = "Язык интерфейса и уведомлений пользователя. " +
                    "Может использоваться для локализации сообщений и ошибок. " +
                    "Если не указано — применяется язык по умолчанию (ru).",
            example = "ru",
            allowableValues = {"ru", "uz", "uzk", "en", "kaa"},
            nullable = true
    )
    private Language language;

    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email is not valid")
    @Schema(
            description = "Электронная почта пользователя, используемая как логин. " +
                    "Должна быть в корректном формате email.",
            example = "user@example.com",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String email;

    @NotEmpty(message = "Password cannot be empty")
    @Schema(
            description = "Пароль пользователя для входа в систему. " +
                    "Рекомендуется использовать не менее 8 символов, включая буквы, цифры и специальные символы.",
            example = "P@ssw0rd!",
            accessMode = Schema.AccessMode.WRITE_ONLY,
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String password;
}
