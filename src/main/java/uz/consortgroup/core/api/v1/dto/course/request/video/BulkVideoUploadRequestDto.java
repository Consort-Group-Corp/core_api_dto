package uz.consortgroup.core.api.v1.dto.course.request.video;

import jakarta.validation.Valid;
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
public class BulkVideoUploadRequestDto {
    @NotEmpty(message = "Videos list can not be empty")
    @Valid
    private List<VideoUploadRequestDto> videos;
}