package uz.consortgroup.core.api.v1.dto.forum.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Запрос на создание комментария к форуму")
public class ForumCommentCreateRequestDto {

    @Schema(description = "Комментарий", example = "Comment")
    @NotBlank(message = "Content is required")
    private String content;
}
