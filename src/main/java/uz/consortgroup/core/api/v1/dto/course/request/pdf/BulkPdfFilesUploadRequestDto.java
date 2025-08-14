package uz.consortgroup.core.api.v1.dto.course.request.pdf;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "BulkPdfFilesUploadRequestDto", description = "Пакетная загрузка PDF (метаданные)")
public class BulkPdfFilesUploadRequestDto {
    @NotEmpty(message = "Pdf files list can not be empty")
    @ArraySchema(arraySchema = @Schema(description = "Список метаданных PDF",
            requiredMode = Schema.RequiredMode.REQUIRED),
            schema = @Schema(implementation = PdfFileUploadRequestDto.class))
    private List<PdfFileUploadRequestDto> pdfs;
}