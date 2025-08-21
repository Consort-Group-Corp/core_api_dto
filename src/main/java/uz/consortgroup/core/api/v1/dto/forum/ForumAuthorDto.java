package uz.consortgroup.core.api.v1.dto.forum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ForumAuthorDto {
    private UUID id;
    private String lastName;
    private String firstName;
    private String middleName;
    private UserRole role;
}
