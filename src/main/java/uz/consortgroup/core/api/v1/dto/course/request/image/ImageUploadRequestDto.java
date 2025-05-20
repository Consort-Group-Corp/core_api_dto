package uz.consortgroup.core.api.v1.dto.course.request.image;

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
public class ImageUploadRequestDto {
    @NotNull(message = "Order position is required")
    private Integer orderPosition;
    private List<ResourceTranslationRequestDto> translations;
}