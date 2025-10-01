package uz.consortgroup.core.api.v1.dto.user.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(description = "Полная информация о пользователе")
public class UserFullInfoResponseDto {

    @Schema(description = "ID пользователя")
    private UUID id;

    @Schema(description = "Язык интерфейса пользователя (enum)")
    private Language language;

    @Schema(description = "Фамилия")
    private String lastName;

    @Schema(description = "Имя")
    private String firstName;

    @Schema(description = "Отчество")
    private String middleName;

    @Schema(description = "Дата рождения", example = "1995-04-23")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate bornDate;

    @Schema(description = "Телефон (можно маскировать)")
    private String phoneNumber;

    @Schema(description = "Место работы")
    private String workPlace;

    @Email
    @Schema(description = "Email")
    private String email;

    @Schema(description = "Должность")
    private String position;

    @Schema(description = "ПИНФЛ")
    private String pinfl;

    @Schema(description = "Флаг верификации")
    private Boolean verified;

    @Schema(description = "Роль")
    private UserRole role;

    @Schema(description = "Статус")
    private UserStatus status;

    @Schema(description = "Создан", example = "2025-09-01T10:00:00")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime createdAt;

    @Schema(description = "Обновлён", example = "2025-09-10T12:34:56")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime updatedAt;

    @Schema(description = "Последний вход", example = "2025-09-20T08:15:00")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime lastLogin;

}
