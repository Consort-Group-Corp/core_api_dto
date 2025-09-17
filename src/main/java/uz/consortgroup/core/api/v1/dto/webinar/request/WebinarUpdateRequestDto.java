package uz.consortgroup.core.api.v1.dto.webinar.request;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.webinar.enumeration.LanguageCode;
import uz.consortgroup.core.api.v1.dto.webinar.enumeration.WebinarCategory;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(description = "Обновление вебинара")
public class WebinarUpdateRequestDto {

    @NotNull(message = "Webinar ID is required")
    @Schema(description = "ID вебинара", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID id;

    @NotBlank(message = "Webinar title must not be blank")
    @Size(max = 100, message = "Webinar title must not exceed 100 characters")
    @Schema(description = "Название вебинара", type = "string", maxLength = 100)
    private String title;

    @NotNull(message = "Category required")
    @Schema(description = "Категория вебинара", example = "planned")
    private WebinarCategory category;

    @NotNull(message = "Start time is required")
    @Schema(description = "Время начала вебинара", type = "string", format = "date-time")
    private LocalDateTime startTime;

    @NotNull(message = "End time is required")
    @Schema(description = "Время окончания вебинара", type = "string", format = "date-time")
    private LocalDateTime endTime;

    @NotBlank(message = "Platform URL is required")
    @Size(max = 255, message = "Platform URL must not exceed 255 characters")
    @Pattern(regexp = "^(https?://).+", message = "Platform URL must start with http:// or https://")
    @Schema(description = "URL платформы", type = "string", maxLength = 255)
    private String platformUrl;

    @NotNull(message = "Course ID is required")
    @Schema(description = "ID курса", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID courseId;

    @NotNull(message = "Language code is required")
    @Schema(description = "Код языка", example = "RU", requiredMode = Schema.RequiredMode.REQUIRED)
    private LanguageCode languageCode;

    @ArraySchema(arraySchema = @Schema(description = "Участники вебинара"), schema = @Schema(type = "string"))
    private List<String> participants;
}
