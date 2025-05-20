package uz.consortgroup.core.api.v1.dto.user.auth;

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
    private String token;
    private UserRole role;
}
