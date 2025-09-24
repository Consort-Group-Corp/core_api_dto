package uz.consortgroup.core.api.v1.dto.forum.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Данные о лайках")
public class ForumLikeResponseDto {
    @Schema(description = "Количество лайков", example = "10")
    private long likeCount;

    @Schema(description = "Лайкнул ли человек", example = "true")
    private boolean likedByMe;
}
