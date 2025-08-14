package uz.consortgroup.core.api.v1.dto.user.super_admin;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.*;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;
import uz.consortgroup.core.api.v1.dto.user.enumeration.ValidUserRoleEnum;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "UserCreate", description = "Данные для создания нового пользователя")
public class UserCreateDto {

    @Schema(description = "Язык интерфейса пользователя", example = "ru")
    @NotNull(message = "Language is required")
    private Language language;

    @Schema(description = "Фамилия", example = "Иванов")
    @NotBlank(message = "Last name is required")
    private String lastName;

    @Schema(description = "Имя", example = "Иван")
    @NotBlank(message = "First name is required")
    private String firstName;

    @Schema(description = "Отчество", example = "Иванович")
    @NotBlank(message = "Middle name is required")
    private String middleName;

    @Schema(description = "Дата рождения (ISO-8601)", type = "string", format = "date", example = "1990-05-20")
    @NotNull(message = "Born date is required")
    private LocalDate bornDate;

    @Schema(description = "Номер телефона в международном формате", example = "+998901234567")
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    @Schema(description = "Место работы", example = "Consort Group")
    @NotBlank(message = "Work place is required")
    private String workPlace;

    @Schema(description = "Электронная почта", example = "new.user@example.com")
    @NotBlank(message = "Email is required")
    private String email;

    @Schema(description = "Должность/позиция", example = "Mentor")
    @NotBlank(message = "Position is required")
    private String position;

    @Schema(description = "ПИНФЛ (14 цифр)", example = "12345678901234")
    @NotBlank(message = "Pinfl is required")
    private String pinfl;

    @Schema(
            description = "Пароль. Минимум 8 символов, хотя бы одна цифра, строчная и заглавная буква.",
            example = "Abcdef12"
    )
    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 100, message = "Password must be between 8 and 100 characters")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$",
            message = "Password must contain at least one digit, one lowercase letter, and one uppercase letter")
    private String password;

    @Schema(description = "Роль нового пользователя (если не указано — будет применена роль по умолчанию для вашей бизнес-логики)", example = "MENTOR")
    @ValidUserRoleEnum(enumClass = UserRole.class)
    private UserRole role;
}
