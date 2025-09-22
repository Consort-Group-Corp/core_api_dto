package uz.consortgroup.core.api.v1.dto.forum.moderation.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintReason;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserMuteListItemResponseDto {
    private UUID id;
    private UUID forumId;
    private ModerationUserInfoResponseDto user;
    private ModerationUserInfoResponseDto issuedBy;
    private ComplaintReason reason;
    private Instant muteUntil;
    private Instant createdAt;
    private Boolean active;
    private Integer violationCount;
}
