package uz.consortgroup.core.api.v1.dto.forum.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.LanguageCode;

import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Тема форума")
public class ForumTopicCreateRequestDto {

    @NotBlank(message = "Title is required")
    @Schema(description = "Заголовок темы", example = "Введение в Spring Boot")
    @Size(max = 120, message = "Title must be at most 120 characters")
    private String title;

    @Schema(description = "Содержание темы", example = "Первый урок курса")
    @NotBlank(message = "Content is required")
    private String content;

    @Schema(description = "Язык темы", example = "RU")
    @NotNull(message = "Language code is required")
    private LanguageCode languageCode;

    @Size(max = 32, message = "Lesson ref type must be at most 32 characters")
    @Schema(description = "Тип ссылки на внешний объект (например LESSON, WEBINAR, EXTERNAL_URL, NONE)",
            example = "LESSON",
            allowableValues = {"LESSON", "WEBINAR", "EXTERNAL_URL", "NONE"})
    @Size(max = 32, message = "Lesson ref type must be at most 32 characters")
    private String lessonRefType;

    @Schema(description = "ID урока", pattern = UUID_PATTERN_SCHEMA)
    private UUID lessonRefId;
}
