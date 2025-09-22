package uz.consortgroup.core.api.v1.dto.forum.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintReason;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintStatus;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumComplaintResponseDto {
    private UUID id;
    private UUID forumId;
    private UUID topicId;
    private UUID commentId;
    private UUID reporterId;
    private UUID offenderId;
    private ComplaintReason reason;
    private ComplaintStatus status;
    private String messageSnapshot;
    private Instant createdAt;
    private Instant resolvedAt;
    private UUID resolvedBy;
}
