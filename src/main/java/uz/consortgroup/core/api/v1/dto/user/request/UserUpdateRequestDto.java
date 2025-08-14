package uz.consortgroup.core.api.v1.dto.user.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;
import lombok.*;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "UserUpdateRequest", description = "Данные для обновления пользователя")
public class UserUpdateRequestDto {

    @Schema(description = "Фамилия", example = "Иванов", maxLength = 50)
    @NotBlank(message = "Last name is required") @Size(max = 50)
    private String lastName;

    @Schema(description = "Имя", example = "Иван", maxLength = 50)
    @NotBlank(message = "First name is required") @Size(max = 50)
    private String firstName;

    @Schema(description = "Отчество", example = "Иванович", maxLength = 50)
    @NotBlank @Size(max = 50)
    private String middleName;

    @Schema(description = "Дата рождения", example = "20-05-1990")
    @Past @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate bornDate;

    @Schema(description = "Телефон (+998XXXXXXXXX)", example = "+998901234567")
    @NotBlank @Pattern(regexp = "^\\+998\\d{9}$")
    private String phoneNumber;

    @Schema(description = "Место работы", example = "Consort Group", maxLength = 128)
    @NotBlank @Size(max = 128)
    private String workPlace;

    @Schema(description = "Email", example = "user@example.com")
    @Email @NotBlank
    private String email;

    @Schema(description = "Должность", example = "Mentor", maxLength = 128)
    @NotBlank @Size(max = 128)
    private String position;

    @Schema(description = "ПИНФЛ (14 символов)", example = "12345678901234", maxLength = 14)
    @NotBlank @Size(max = 14)
    private String pinfl;

    @Schema(description = "Роль", example = "MENTOR")
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Role is required")
    private UserRole role;
}
