package uz.consortgroup.core.api.v1.dto.webinar.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.response.UserShortInfoResponseDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WebinarListItemResponseDto {
    private UUID id;
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String platformUrl;
    private String previewUrl;
    private List<UserShortInfoResponseDto> tutors;
}
