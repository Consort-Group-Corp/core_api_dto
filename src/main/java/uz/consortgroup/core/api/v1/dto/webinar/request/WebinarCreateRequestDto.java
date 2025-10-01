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
@Schema(description = "Запрос на создание вебинара")
public class WebinarCreateRequestDto {

    @NotBlank
    @Size(max = 100)
    @Schema(description = "Заголовок вебинара", example = "Введение в Spring Boot")
    private String title;

    @NotNull
    @Schema(description = "Категория вебинара",
            allowableValues = {"planned", "past"},
            example = "planned")
    private WebinarCategory category;

    @NotNull
    @Schema(description = "Время начала вебинара",
            type = "string", format = "date-time",
            example = "2025-08-20T10:00:00")
    private LocalDateTime startTime;

    @NotNull
    @Schema(description = "Время окончания вебинара",
            type = "string", format = "date-time",
            example = "2025-08-20T11:00:00")
    private LocalDateTime endTime;

    @NotBlank
    @Size(max = 255)
    @Pattern(regexp = "^(https?://).+", message = "Platform URL must start with http:// or https://")
    @Schema(description = "URL платформы", example = "https://meet.example.com/room-123")
    private String platformUrl;

    @NotNull
    @Schema(description = "ID курса",
            type = "string", format = "uuid",
            pattern = UUID_PATTERN_SCHEMA,
            example = "df25826b-3c90-4e22-a820-224d4cfb85fa")
    private UUID courseId;

    @NotNull
    @Schema(description = "Код языка интерфейса",
            allowableValues = {"RU", "EN", "UZ", "UZK", "KAA"},
            example = "RU")
    private LanguageCode languageCode;

    @Builder.Default
    @Schema(description = "Ограничить участие только записанными на выбранный курс", example = "false")
    private Boolean onlyCourseParticipants = false;

    @ArraySchema(
            arraySchema = @Schema(description = "Список участников (email или 14-значный PINFL)"),
            schema = @Schema(example = "user1@example.com || 30809912345678"),
            maxItems = 100
    )
    private Set<@EmailOrPinfl String> participants;
}
