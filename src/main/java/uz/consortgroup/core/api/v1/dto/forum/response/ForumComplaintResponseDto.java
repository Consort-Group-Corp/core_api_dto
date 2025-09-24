package uz.consortgroup.core.api.v1.dto.forum.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintReason;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintStatus;

import java.time.Instant;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Жалоба на форум")
public class ForumComplaintResponseDto {
    @Schema(description = "ID жалобы", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "ID форума", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID forumId;

    @Schema(description = "ID темы", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID topicId;

    @Schema(description = "ID комментария", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID commentId;

    @Schema(description = "ID создателя жалобы", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID reporterId;

    @Schema(description = "ID нарушителя", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID offenderId;

    @Schema(description = "Причина жалобы")
    private ComplaintReason reason;

    @Schema(description = "Статус жалобы")
    private ComplaintStatus status;

    @Schema(description = "Снапшот сообщения")
    private String messageSnapshot;

    @Schema(description = "Время создания", example = "2025-01-01T00:00:00")
    private Instant createdAt;

    @Schema(description = "Время решения", example = "2025-01-01T00:00:00")
    private Instant resolvedAt;

    @Schema(description = "ID решившего", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID resolvedBy;
}
