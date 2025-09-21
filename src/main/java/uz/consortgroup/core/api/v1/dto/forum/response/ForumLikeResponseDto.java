package uz.consortgroup.core.api.v1.dto.forum.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumLikeResponseDto {
    private long likeCount;
    private boolean likedByMe;
}
