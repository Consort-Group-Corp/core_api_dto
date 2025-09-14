package uz.consortgroup.core.api.v1.dto.support.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.support.enumeration.SupportIssueType;
import uz.consortgroup.core.api.v1.dto.support.enumeration.SupportTicketStatus;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

import java.time.Instant;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "SupportTicketResponse", description = "Ответ с данными тикета")
public class SupportTicketResponse {

    @Schema(description = "ID тикета", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "ID пользователя", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID userId;

    @Schema(description = "Роль пользователя", implementation = UserRole.class)
    private UserRole role;


    @Schema(description = "Тип проблемы (пресет/кастом)", implementation = SupportIssueType.class)
    private SupportIssueType issueType;

    @Schema(description = "ID выбранного пресета (если тип PRESET)", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID selectedIssueId;

    @Schema(description = "Комментарий пользователя", example = "Кнопка «Сохранить» не реагирует")
    private String comment;

    @Schema(description = "Текущий статус тикета", implementation = SupportTicketStatus.class)
    private SupportTicketStatus status;

    @Schema(description = "Время создания", type = "string", format = "date-time", example = "2025-09-13T17:28:09Z")
    private Instant createdAt;

    @Schema(description = "Время обновления", type = "string", format = "date-time", example = "2025-09-13T18:05:00Z")
    private Instant updatedAt;
}
