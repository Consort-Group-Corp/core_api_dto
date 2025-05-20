package uz.consortgroup.core.api.v1.dto.course.response.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.MimeType;
import uz.consortgroup.core.api.v1.dto.course.enumeration.ResourceType;


import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourceResponseDto {
    private UUID id;
    private UUID lessonId;
    private ResourceType resourceType;
    private String fileUrl;
    private Long fileSize;
    private MimeType mimeType;
    private Integer orderPosition;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<ResourceTranslationResponseDto> translations;
}