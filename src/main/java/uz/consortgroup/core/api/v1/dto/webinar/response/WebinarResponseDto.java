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
import java.util.List;
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

    @Schema(description = "Заголовок вебинара")
    private String title;

    @Schema(description = "Категория вебинара")
    private WebinarCategory category;

    @Schema(description = "Ссылка на превью вебинара")
    private String previewUrl;

    @Schema(description = "Имя файла превью вебинара")
    private String previewFilename;

    @Schema(description = "Время начала вебинара")
    private LocalDateTime startTime;

    @Schema(description = "Время окончания вебинара")
    private LocalDateTime endTime;

    @Schema(description = "Ссылка на платформу вебинара")
    private String platformUrl;

    @Schema(description = "ID курса", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID courseId;

    @Schema(description = "Язык вебинара", example = "RU")
    private LanguageCode languageCode;

    @ArraySchema(arraySchema = @Schema(description = "Участники вебинара"), schema = @Schema(type = "string"))
    private List<String> participants;

    @Schema(description = "ID создателя вебинара", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID createdBy;

    @Schema(description = "Дата создания", type = "LocalDateTime")
    private LocalDateTime createdAt;

    @Schema(description = "Дата обновления", type = "LocalDateTime")
    private LocalDateTime updatedAt;
}
