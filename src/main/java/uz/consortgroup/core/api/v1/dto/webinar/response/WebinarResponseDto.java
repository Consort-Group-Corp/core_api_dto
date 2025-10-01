package uz.consortgroup.core.api.v1.dto.webinar.response;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.webinar.enumeration.LanguageCode;
import uz.consortgroup.core.api.v1.dto.webinar.enumeration.WebinarCategory;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Вебинар")
public class WebinarResponseDto {
    @Schema(description = "ID вебинара", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID id;

    private String title;

    private WebinarCategory category;

    private String previewUrl;

    private String previewFilename;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String platformUrl;

    @Schema(description = "ID курса", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID courseId;

    private LanguageCode languageCode;

    @Schema(description = "Ограничение участия только записанными на курс")
    private Boolean onlyCourseParticipants;

    @ArraySchema(
            arraySchema = @Schema(description = "Список участников (email или PINFL)"),
            schema = @Schema(example = "user1@example.com / 30809912345678"),
            maxItems = 100
    )
    private Set<String> participants;

    private UUID createdBy;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
