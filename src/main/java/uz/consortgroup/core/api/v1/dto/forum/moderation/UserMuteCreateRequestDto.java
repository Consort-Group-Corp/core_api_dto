package uz.consortgroup.core.api.v1.dto.forum.moderation;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintReason;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserMuteCreateRequestDto {

    @NotNull(message = "User ID is required")
    private UUID userId;

    @NotNull(message = "Reason is required")
    private ComplaintReason reason;

    @NotNull(message = "Mute until is required")
    private Instant muteUntil;
}