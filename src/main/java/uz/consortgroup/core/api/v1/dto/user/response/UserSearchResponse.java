package uz.consortgroup.core.api.v1.dto.user.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserSearchResponse {
    private String lastName;
    private String firstName;
    private String middleName;
    private String email;
    private String pinfl;
    private UserRole role;
    private String organizationName;
}
