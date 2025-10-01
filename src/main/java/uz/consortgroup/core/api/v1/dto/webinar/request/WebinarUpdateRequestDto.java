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
import uz.consortgroup.core.api.v1.dto.webinar.core.EmailOrPinfl;
import uz.consortgroup.core.api.v1.dto.webinar.enumeration.LanguageCode;
import uz.consortgroup.core.api.v1.dto.webinar.enumeration.WebinarCategory;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(description = "Обновление вебинара")
public class WebinarUpdateRequestDto {

    @NotNull
    @Schema(description = "ID вебинара", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID id;

    @NotBlank
    @Size(max = 100)
    @Schema(description = "Название вебинара", type = "string", maxLength = 100)
    private String title;

    @NotNull
    @Schema(description = "Категория вебинара",
            allowableValues = {"planned", "past"},
            example = "planned")
    private WebinarCategory category;

    @NotNull
    @Schema(type = "string", format = "date-time", example = "2025-08-20T10:00:00")
    private LocalDateTime startTime;

    @NotNull
    @Schema(type = "string", format = "date-time", example = "2025-08-20T11:00:00")
    private LocalDateTime endTime;

    @NotBlank
    @Size(max = 255)
    @Pattern(regexp = "^(https?://).+", message = "Platform URL must start with http:// or https://")
    private String platformUrl;

    @NotNull
    @Schema(description = "ID курса", type = "string", format = "uuid", pattern = UUID_PATTERN_SCHEMA)
    private UUID courseId;

    @NotNull
    @Schema(description = "Код языка интерфейса", allowableValues = {"RU", "EN", "UZ", "UZK", "KAA"})
    private LanguageCode languageCode;

    @NotNull
    @Schema(description = "Ограничить участие только записанными на выбранный курс")
    private Boolean onlyCourseParticipants;

    @ArraySchema(
            arraySchema = @Schema(description = "Полная замена состава участников (email или PINFL)"),
            schema = @Schema(example = "user2@example.com / 30809912345678"),
            maxItems = 100
    )
    private Set<@EmailOrPinfl String> participants;
}
