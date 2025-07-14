package uz.consortgroup.core.api.v1.dto.user.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserSearchResponse {
    private UUID userId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String email;
    private String pinfl;
    private UserRole role;
    private String organizationName;
}
