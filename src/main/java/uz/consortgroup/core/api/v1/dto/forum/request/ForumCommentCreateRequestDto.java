package uz.consortgroup.core.api.v1.dto.forum.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumCommentCreateRequestDto {

    @NotBlank(message = "Content is required")
    private String content;
}
