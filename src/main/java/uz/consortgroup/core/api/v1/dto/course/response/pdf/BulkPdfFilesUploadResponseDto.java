package uz.consortgroup.core.api.v1.dto.course.response.pdf;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BulkPdfFilesUploadResponseDto {
    private List<PdfFileUploadResponseDto> pdfFiles;
}