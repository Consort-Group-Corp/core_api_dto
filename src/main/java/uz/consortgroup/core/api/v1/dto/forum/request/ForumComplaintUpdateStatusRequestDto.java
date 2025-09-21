package uz.consortgroup.core.api.v1.dto.forum.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ComplaintStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumComplaintUpdateStatusRequestDto {

    @NotNull(message = "Status is required")
    private ComplaintStatus status;
}
