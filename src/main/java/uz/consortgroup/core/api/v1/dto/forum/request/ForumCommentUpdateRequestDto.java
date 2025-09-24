package uz.consortgroup.core.api.v1.dto.forum.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "Обновление комментария", description = "Запрос на обновление комментария")
public class ForumCommentUpdateRequestDto {

    @Schema(description = "Комментарий", example = "Комментарий")
    @NotBlank(message = "Content is required")
    private String content;
}
