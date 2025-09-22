package uz.consortgroup.core.api.v1.dto.forum.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintReason;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumComplaintCreateRequestDto {
    @NotNull(message = "Forum ID is required")
    private UUID forumId;
    private UUID topicId;
    private UUID commentId;

    @NotNull(message = "Offender ID is required")
    private UUID offenderId;

    @NotNull(message = "Reason is required")
    private ComplaintReason reason;
    private String messageSnapshot;
}
