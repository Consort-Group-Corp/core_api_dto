package uz.consortgroup.core.api.v1.dto.forum.request;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "Обновление статуса жалобы")
public class ForumComplaintUpdateStatusRequestDto {

    @Schema(description = "Статус жалобы", example = "NEW")
    @NotNull(message = "Status is required")
    private ComplaintStatus status;
}
