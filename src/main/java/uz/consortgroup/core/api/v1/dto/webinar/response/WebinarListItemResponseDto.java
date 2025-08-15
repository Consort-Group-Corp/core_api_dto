package uz.consortgroup.core.api.v1.dto.webinar.response;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.response.UserShortInfoResponseDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Вебинар")
public class WebinarListItemResponseDto {
    @Schema(description = "ID вебинара", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID id;

    @Schema(description = "Название вебинара")
    private String title;

    @Schema(description = "Дата начала вебинара", type = "LocalDateTime", format = "date-time", example = "2025-05-01T10:00:00Z")
    private LocalDateTime startTime;

    @Schema(description = "Дата окончания вебинара", type = "LocalDateTime", format = "date-time", example = "2025-07-01T10:00:00Z")
    private LocalDateTime endTime;

    @Schema(description = "URL платформы")
    private String platformUrl;

    @Schema(description = "URL превью")
    private String previewUrl;

    @ArraySchema(arraySchema = @Schema(description = "Тьюторы"))
    private List<UserShortInfoResponseDto> tutors;
}
