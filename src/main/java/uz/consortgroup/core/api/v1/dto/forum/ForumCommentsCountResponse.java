package uz.consortgroup.core.api.v1.dto.forum;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(description = "Количество комментариев")
public class ForumCommentsCountResponse {
    @Schema(description = "Общее количество комментариев")
    private Long totalCount;
}
