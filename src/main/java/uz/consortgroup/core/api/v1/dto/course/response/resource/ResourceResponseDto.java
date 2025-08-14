package uz.consortgroup.core.api.v1.dto.course.response.resource;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.MimeType;
import uz.consortgroup.core.api.v1.dto.course.enumeration.ResourceType;


import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "ResourceResponseDto", description = "Информация о ресурсе урока")
public class ResourceResponseDto {
    @Schema(description = "ID ресурса")
    private UUID id;

    @Schema(description = "ID урока")
    private UUID lessonId;

    @Schema(description = "Тип ресурса", example = "VIDEO", implementation = ResourceType.class)
    private ResourceType resourceType;

    @Schema(description = "URL файла")
    private String fileUrl;

    @Schema(description = "Размер файла, байт", example = "1048576")
    private Long fileSize;

    @Schema(description = "MIME-тип", example = "video/mp4", implementation = MimeType.class)
    private MimeType mimeType;

    @Schema(description = "Порядок", example = "1")
    private Integer orderPosition;

    @Schema(description = "Создан", type = "string", format = "date-time")
    private LocalDateTime createdAt;

    @Schema(description = "Обновлён", type = "string", format = "date-time")
    private LocalDateTime updatedAt;

    @ArraySchema(arraySchema = @Schema(description = "Переводы ресурса"),
            schema = @Schema(implementation = ResourceTranslationResponseDto.class))
    private List<ResourceTranslationResponseDto> translations;
}