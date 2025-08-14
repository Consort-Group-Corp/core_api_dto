package uz.consortgroup.core.api.v1.dto.user.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "UserProfileResponse", description = "Профиль пользователя")
public class UserProfileResponseDto {

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

    @Schema(description = "Роль", example = "MENTOR")
    private UserRole role;
    @Schema(description = "Статус", example = "ACTIVE")
    private UserStatus status;

    @Schema(description = "Создан", example = "2025-08-13T12:00:00")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createdAt;

    @Schema(description = "Обновлен", example = "2025-08-13T12:30:00")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime updatedAt;

    @Schema(description = "Последний вход", example = "2025-08-14T09:15:00")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime lastLoginAt;
}
