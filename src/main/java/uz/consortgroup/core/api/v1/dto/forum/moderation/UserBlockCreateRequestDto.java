package uz.consortgroup.core.api.v1.dto.forum.moderation;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintReason;

import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(description = "Заблокировать пользователя")
public class UserBlockCreateRequestDto {

    @Schema(description = "ID пользователя", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    @NotNull(message = "User ID is required")
    private UUID userId;

    @Schema(description = "Причина жалобы", example = "SPAM")
    @NotNull(message = "Reason is required")
    private ComplaintReason reason;
}
