package uz.consortgroup.core.api.v1.dto.user.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "UserProfileRequest", description = "Запрос на заполнение профиля")
public class UserProfileRequestDto {

    @Schema(description = "Фамилия", example = "Иванов", maxLength = 50)
    @NotBlank(message = "Last name is required") @Size(max = 50)
    private String lastName;

    @Schema(description = "Имя", example = "Иван", maxLength = 50)
    @NotBlank(message = "First name is required") @Size(max = 50)
    private String firstName;

    @Schema(description = "Отчество", example = "Иванович", maxLength = 50)
    @NotBlank(message = "Middle name is required") @Size(max = 50)
    private String middleName;

    @Schema(description = "Дата рождения", type = "string", format = "date", example = "20-05-1990")
    @NotNull(message = "Born date is required")
    @Past(message = "Born date must be in the past")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate bornDate;

    @Schema(description = "Телефон (+998XXXXXXXXX)", example = "+998901234567", maxLength = 13)
    @Nullable
    @Size(max = 13)
    @Pattern(regexp = "^\\+998\\d{9}$")
    private String phoneNumber;

    @Schema(description = "Место работы", example = "Consort Group", maxLength = 120)
    @NotBlank(message = "Work place is required") @Size(max = 128)
    private String workPlace;

    @Schema(description = "Должность", example = "Mentor", maxLength = 128)
    @NotBlank(message = "Position is required") @Size(max = 128)
    private String position;

    @Schema(description = "ПИНФЛ (14 символов)", example = "12345678901234", maxLength = 14)
    @NotBlank(message = "Pinfl is required") @Size(max = 14)
    private String pinfl;
}
