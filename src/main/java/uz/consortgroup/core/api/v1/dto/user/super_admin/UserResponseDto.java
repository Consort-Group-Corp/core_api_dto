package uz.consortgroup.core.api.v1.dto.user.super_admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "UserResponse", description = "Ответ с данными пользователя")
public class UserResponseDto {

    @Schema(description = "ID пользователя", example = "3a7a8b02-9a1b-4e7d-9c0a-1b2c3d4e5f60")
    private UUID id;

    @Schema(description = "Язык интерфейса пользователя (см. ваш enum)", example = "ru")
    private Language language;

    @Schema(description = "Фамилия", example = "Иванов")
    private String lastName;

    @Schema(description = "Имя", example = "Иван")
    private String firstName;

    @Schema(description = "Отчество", example = "Иванович")
    private String middleName;

    @Schema(description = "Дата рождения (ISO-8601)", type = "string", format = "date", example = "1990-05-20")
    private LocalDate bornDate;

    @Schema(description = "Номер телефона в международном формате", example = "+998901234567")
    private String phoneNumber;

    @Schema(description = "Место работы", example = "Consort Group")
    private String workPlace;

    @Schema(description = "Электронная почта", example = "user@example.com")
    private String email;

    @Schema(description = "Должность/позиция", example = "Mentor")
    private String position;

    @Schema(description = "ПИНФЛ (14 цифр)", example = "12345678901234")
    private String pinfl;

    @Schema(description = "Текущая роль пользователя", example = "MENTOR")
    private UserRole role;
}
