package uz.consortgroup.core.api.v1.dto.course.request.pdf;

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
public class BulkPdfFilesUploadRequestDto {
    @NotEmpty(message = "Pdf files list can not be empty")
    private List<PdfFileUploadRequestDto> pdfs;
}