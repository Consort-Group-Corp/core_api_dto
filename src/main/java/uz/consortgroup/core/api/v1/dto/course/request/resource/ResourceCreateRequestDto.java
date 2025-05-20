package uz.consortgroup.core.api.v1.dto.course.request.resource;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.MimeType;
import uz.consortgroup.core.api.v1.dto.course.enumeration.ResourceType;


import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResourceCreateRequestDto {
    @NotNull
    private UUID lessonId;

    @NotNull
    private ResourceType resourceType;

    @NotNull
    private String fileUrl;
    private Long fileSize;
    private MimeType mimeType;

    @NotNull
    private Integer orderPosition;
    private List<ResourceTranslationRequestDto> translations;
}