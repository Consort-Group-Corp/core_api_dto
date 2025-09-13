package uz.consortgroup.core.api.v1.dto.support.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.support.enumeration.SupportIssueType;
import uz.consortgroup.core.api.v1.dto.support.enumeration.SupportTicketStatus;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SupportTicketResponse {
    private UUID id;
    private UUID userId;
    private UserRole role;
    private SupportIssueType issueType;
    private UUID selectedIssueId;
    private String comment;
    private SupportTicketStatus status;
    private Instant createdAt;
    private Instant updatedAt;
}
