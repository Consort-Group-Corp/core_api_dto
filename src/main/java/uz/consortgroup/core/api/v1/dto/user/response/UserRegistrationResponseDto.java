package uz.consortgroup.core.api.v1.dto.user.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "UserRegistrationResponse", description = "Результат регистрации")
public class UserRegistrationResponseDto {
    @Schema(description = "ID пользователя", example = "1dc5e8a1-9c3e-4f1a-9d8e-4a3e8f5c9a12")
    private UUID id;

    @Schema(description = "Язык пользователя", example = "ru")
    private Language language;

    @Schema(description = "Email", example = "user@example.com")
    private String email;
}
