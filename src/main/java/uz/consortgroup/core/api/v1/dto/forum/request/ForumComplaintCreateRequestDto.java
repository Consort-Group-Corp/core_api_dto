package uz.consortgroup.core.api.v1.dto.forum.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintReason;

import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Жалоба на форум")
public class ForumComplaintCreateRequestDto {
    @Schema(description = "ID форума", pattern = UUID_PATTERN_SCHEMA)
    @NotNull(message = "Forum ID is required")
    private UUID forumId;

    @Schema(description = "ID темы", pattern = UUID_PATTERN_SCHEMA)
    private UUID topicId;

    @Schema(description = "ID комментария", pattern = UUID_PATTERN_SCHEMA)
    private UUID commentId;

    @Schema(description = "ID пользователя", pattern = UUID_PATTERN_SCHEMA)
    @NotNull(message = "Offender ID is required")
    private UUID offenderId;

    @Schema(description = "Причина жалобы")
    @NotNull(message = "Reason is required")
    private ComplaintReason reason;

    @Schema(description = "Снапшот сообщения")
    private String messageSnapshot;
}
