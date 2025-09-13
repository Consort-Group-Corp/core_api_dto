package uz.consortgroup.core.api.v1.dto.support.request;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateTicketRequestDto {
    private UUID selectedIssueId;

    @Size(max = 500)
    private String comment;

    @AssertTrue(message = "Either selectedIssueId or comment must be provided")
    public boolean isEitherProvided() {
        return selectedIssueId != null || (comment != null && !comment.isBlank());
    }
}
