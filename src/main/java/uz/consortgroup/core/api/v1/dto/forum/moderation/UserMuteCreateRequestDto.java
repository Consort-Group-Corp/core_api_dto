package uz.consortgroup.core.api.v1.dto.forum.moderation;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintReason;

import java.time.Instant;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "Замутить пользователя")
public class UserMuteCreateRequestDto {

    @NotNull(message = "User ID is required")
    @Schema(description = "ID пользователя", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID userId;

    @Schema(description = "Причина мута")
    @NotNull(message = "Reason is required")
    private ComplaintReason reason;

    @Schema(description = "Время окончания мута")
    @NotNull(message = "Mute until is required")
    private Instant muteUntil;
}