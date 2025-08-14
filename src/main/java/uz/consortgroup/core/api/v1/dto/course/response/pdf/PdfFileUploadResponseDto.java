package uz.consortgroup.core.api.v1.dto.course.response.pdf;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.response.resource.ResourceTranslationResponseDto;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "PdfFileUploadResponseDto", description = "Результат загрузки одного PDF")
public class PdfFileUploadResponseDto {
    @Schema(description = "ID ресурса")
    private UUID resourceId;

    @Schema(description = "URL файла", example = "https://cdn.example.com/file.pdf")
    private String fileUrl;

    @Schema(description = "Порядок", example = "1")
    private Integer orderPosition;

    @ArraySchema(arraySchema = @Schema(description = "Переводы ресурса"),
            schema = @Schema(implementation = ResourceTranslationResponseDto.class))
    private List<ResourceTranslationResponseDto> translations;
}