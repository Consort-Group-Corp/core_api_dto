package uz.consortgroup.core.api.v1.dto.user.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JwtResponse {
    @Schema(
            description = "JWT-токен для авторизации в системе. " +
                    "Используется в заголовке Authorization в формате: Bearer {token}.",
            example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
    )
    private String token;

    @Schema(
            description = "Роль пользователя в системе.",
            example = "SUPER_ADMIN",
            allowableValues = {
                    "SUPER_ADMIN", "ADMIN", "MENTOR", "STUDENT", "HR", "MODERATOR",
                    "ACCOUNTANT", "TECH_SUPPORT", "GUEST_USER", "MANAGER_COURSE", "ANALYST"
            }
    )
    private UserRole role;
}
