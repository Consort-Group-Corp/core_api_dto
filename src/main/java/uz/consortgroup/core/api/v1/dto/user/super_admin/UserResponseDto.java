package uz.consortgroup.core.api.v1.dto.user.super_admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserResponseDto {
    private UUID id;
    private Language language;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate bornDate;
    private String phoneNumber;
    private String workPlace;
    private String email;
    private String position;
    private String pinfl;
    private UserRole role;
}
