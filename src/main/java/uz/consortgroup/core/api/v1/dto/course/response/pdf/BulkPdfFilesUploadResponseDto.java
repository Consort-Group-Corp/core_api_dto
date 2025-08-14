package uz.consortgroup.core.api.v1.dto.course.response.pdf;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "BulkPdfFilesUploadResponseDto", description = "Результат пакетной загрузки PDF")
public class BulkPdfFilesUploadResponseDto {
    @ArraySchema(arraySchema = @Schema(description = "Результаты по каждому PDF"),
            schema = @Schema(implementation = PdfFileUploadResponseDto.class))
    private List<PdfFileUploadResponseDto> pdfFiles;
}