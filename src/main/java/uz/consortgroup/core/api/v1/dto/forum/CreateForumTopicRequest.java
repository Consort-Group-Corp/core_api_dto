package uz.consortgroup.core.api.v1.dto.forum;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Создание темы в форуме")
public class CreateForumTopicRequest {
    @NotBlank(message = "Title is required")
    @Schema(description = "Название темы", requiredMode = Schema.RequiredMode.REQUIRED)
    private String title;

    @NotBlank(message = "Content is required")
    @Schema(description = "Содержание темы", requiredMode = Schema.RequiredMode.REQUIRED)
    private String content;
}
