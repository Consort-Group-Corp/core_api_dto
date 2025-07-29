package uz.consortgroup.core.api.v1.dto.webinar.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.webinar.enumeration.LanguageCode;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebinarResponseDto {
    private UUID id;
    private String title;
    private String previewUrl;
    private String previewFilename;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String platformUrl;
    private UUID courseId;
    private LanguageCode languageCode;
    private UUID createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
