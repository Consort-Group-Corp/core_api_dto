package uz.consortgroup.core.api.v1.dto.user.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "UpdatePasswordRequest", description = "Запрос на установку нового пароля")
public class UpdatePasswordRequestDto {
    @NotBlank(message = "New password is required")
    @Schema(
            description = "Новый пароль пользователя. Рекомендуется не менее 8 символов, с цифрами, буквами и спецсимволами.",
            example = "N3wP@ssw0rd!"
    )
    private String newPassword;

    @NotBlank(message = "Reset token is required")
    @Schema(
            description = "Подтверждение нового пароля. Должно совпадать с newPassword.",
            example = "N3wP@ssw0rd!"
    )
    private String confirmPassword;
}
