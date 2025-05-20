package uz.consortgroup.core.api.v1.dto.course.response.image;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BulkImageUploadResponseDto {
    private List<ImageUploadResponseDto> images;
}