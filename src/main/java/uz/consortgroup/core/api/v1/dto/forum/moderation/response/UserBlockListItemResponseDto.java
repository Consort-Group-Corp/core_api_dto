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
public class UserBlockListItemResponseDto {
    private UUID id;
    private UUID forumId;
    private ModerationUserInfoResponseDto user;
    private ModerationUserInfoResponseDto issuedBy;
    private ComplaintReason reason;
    private Instant createdAt;
    private Integer violationCount;
}
