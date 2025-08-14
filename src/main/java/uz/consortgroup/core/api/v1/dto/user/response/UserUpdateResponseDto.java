package uz.consortgroup.core.api.v1.dto.user.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "UserUpdateResponse", description = "Результат обновления пользователя")
public class UserUpdateResponseDto {

    @Schema(description = "ID пользователя", example = "1dc5e8a1-9c3e-4f1a-9d8e-4a3e8f5c9a12")
    private UUID id;

    @Schema(description = "Фамилия", example = "Иванов")
    private String lastName;

    @Schema(description = "Имя", example = "Иван")
    private String firstName;

    @Schema(description = "Отчество", example = "Иванович")
    private String middleName;

    @Schema(description = "Дата рождения", example = "20-05-1990")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate bornDate;

    @Schema(description = "Телефон", example = "+998901234567")
    private String phoneNumber;

    @Schema(description = "Место работы", example = "Consort Group")
    private String workPlace;

    @Schema(description = "Email", example = "user@example.com")
    private String email;

    @Schema(description = "Должность", example = "Mentor")
    private String position;

    @Schema(description = "ПИНФЛ", example = "12345678901234")
    private String pinfl;

    @Schema(description = "Статус", example = "ACTIVE")
    private UserStatus status;

    @Schema(description = "Роль", example = "MENTOR")
    private UserRole role;

    @Schema(description = "Время обновления", example = "2025-08-13T12:30:00")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime updatedAt;
}
