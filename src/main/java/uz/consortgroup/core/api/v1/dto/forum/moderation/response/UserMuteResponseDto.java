package uz.consortgroup.core.api.v1.dto.forum.moderation.response;

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
public class UserMuteResponseDto {
    private UUID id;
    private UUID userId;
    private UUID forumId;
    private UUID issuedBy;
    private ComplaintReason reason;
    private Instant muteUntil;
    private Instant createdAt;
}