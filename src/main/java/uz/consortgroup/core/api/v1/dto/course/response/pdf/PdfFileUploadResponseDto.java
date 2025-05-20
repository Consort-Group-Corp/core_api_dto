package uz.consortgroup.core.api.v1.dto.course.response.pdf;

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
public class PdfFileUploadResponseDto {
    private UUID resourceId;
    private String fileUrl;
    private Integer orderPosition;
    private List<ResourceTranslationResponseDto> translations;
}