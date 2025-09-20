package uz.consortgroup.core.api.v1.dto.webinar.request;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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

    @NotNull(message = "Category is required")
    @Schema(description = "Категория вебинара",
            allowableValues = {"planned", "past"},
            example = "planned")
    private WebinarCategory category;

    @NotNull(message = "Start time is required")
    @Schema(description = "Время начала вебинара",
            type = "string", format = "date-time",
            example = "2025-08-20T10:00:00")
    private LocalDateTime startTime;

    @NotNull(message = "End time is required")
    @Schema(description = "Время окончания вебинара",
            type = "string", format = "date-time",
            example = "2025-08-20T11:00:00")
    private LocalDateTime endTime;

    @NotBlank(message = "Platform URL is required")
    @Size(max = 255)
    @Pattern(regexp = "^(https?://).+", message = "Platform URL must start with http:// or https://")
    @Schema(description = "URL платформы", example = "https://meet.example.com/room-123")
    private String platformUrl;

    @NotNull(message = "Course ID is required")
    @Schema(description = "ID курса",
            type = "string", format = "uuid",
            pattern = UUID_PATTERN_SCHEMA,
            example = "df25826b-3c90-4e22-a820-224d4cfb85fa")
    private UUID courseId;

    @NotNull(message = "Language code is required")
    @Schema(description = "Код языка интерфейса",
            allowableValues = {"RU", "EN", "UZ", "UZK", "KAA"},
            example = "RU")
    private LanguageCode languageCode;

    @ArraySchema(
            arraySchema = @Schema(description = "Список email участников"),
            schema = @Schema(format = "email", example = "user1@example.com"),
            minItems = 1,
            maxItems = 100
    )
    @NotEmpty(message = "Participants list cannot be empty")
    private List<String> participants;
}
