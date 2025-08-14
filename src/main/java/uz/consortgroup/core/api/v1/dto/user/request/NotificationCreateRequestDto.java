package uz.consortgroup.core.api.v1.dto.user.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Communication;
import uz.consortgroup.core.api.v1.dto.user.enumeration.CreatorRole;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(name = "NotificationCreateRequest", description = "Параметры отправки/планирования пользовательского уведомления")
public class NotificationCreateRequestDto {

    @Schema(description = "ID пользователя, создавшего уведомление",
            example = "b51f75f9-5a0a-4a66-9f2f-2a0f8b9d1a23", format = "uuid", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "Created by user ID cannot be null")
    private UUID createdByUserId;

    @Schema(description = "Роль инициатора (для аудита/прав доступа)", example = "ADMIN",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "Creator role cannot be null")
    private CreatorRole creatorRole;

    @Schema(description = "Канал коммуникации", example = "PUSH",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "Communication method cannot be null")
    private Communication communication;

    @Schema(description = "Время отправки (локальное время сервиса). Если не указано — отправить сразу.",
            type = "string", format = "date-time", example = "2025-08-13T23:45:00")
    @FutureOrPresent(message = "Send date must be in the present or future")
    private LocalDateTime sendAt;

    @Schema(description = "Флаг активности (можно выключить заранее запланированную рассылку)",
            example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "Active status cannot be null")
    private Boolean active;

    @Schema(description = "Получатели — список ID пользователей",
            example = "[\"8a0b7d1a-0f74-4a7d-8c8d-0e9f0b1c2d3e\",\"7bb3a21c-6b1e-4a99-9b4b-0d1a2c3e4f5a\"]",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "Recipient user IDs cannot be empty")
    @Size(min = 1, max = 100, message = "Recipient user IDs must contain between 1 and 100 items")
    private List<UUID> recipientUserIds;

    @Schema(
            description = "Локализованные тексты: ключ — язык (RU/UZ/EN и т.п.), значение — объект {title, message}",
            type = "object",
            example = """
    {
      "ru": {"title":"Заголовок RU", "message":"Текст RU"},
      "en": {"title":"Title EN", "message":"Message EN"}
    }
    """)
    @NotEmpty(message = "Translations cannot be empty")
    @Valid
    private Map<Language, TranslationDto> translations;

}
