package uz.consortgroup.core.api.v1.dto.forum.moderation.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModerationUserInfoResponseDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String middleName;
    private UserRole role;
}
