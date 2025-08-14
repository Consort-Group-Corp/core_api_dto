package uz.consortgroup.core.api.v1.dto.course.request.pdf;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.request.resource.ResourceTranslationRequestDto;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "PdfFileUploadRequestDto", description = "Метаданные одного PDF-файла")
public class PdfFileUploadRequestDto {
    @NotNull(message = "Order position is required")
    @Schema(description = "Позиция документа в уроке", example = "1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer orderPosition;

    @ArraySchema(arraySchema = @Schema(description = "Переводы ресурса"),
            schema = @Schema(implementation = ResourceTranslationRequestDto.class))
    private List<ResourceTranslationRequestDto> translations;
}