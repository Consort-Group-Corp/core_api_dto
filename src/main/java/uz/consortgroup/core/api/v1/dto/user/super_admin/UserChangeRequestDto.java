package uz.consortgroup.core.api.v1.dto.user.super_admin;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "UserChangeRequest", description = "Запрос на изменение роли пользователя по email")
public class UserChangeRequestDto {

    @Schema(description = "Email пользователя", example = "user@example.com")
    @NotBlank(message = "Email is required")
    private String email;

    @Schema(description = "Новая роль пользователя", example = "MENTOR")
    @NotNull(message = "New role is required")
    private UserRole newRole;
}
