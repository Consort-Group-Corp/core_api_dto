package uz.consortgroup.core.api.v1.dto.webinar.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.webinar.enumeration.LanguageCode;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WebinarCreateRequestDto {

    @NotBlank(message = "Webinar title must not be blank")
    @Size(max = 100, message = "Webinar title must not exceed 100 characters")
    private String title;

    @NotNull(message = "Start time is required")
    private LocalDateTime startTime;

    @NotNull(message = "End time is required")
    private LocalDateTime endTime;

    @NotBlank(message = "Platform URL is required")
    @Size(max = 255, message = "Platform URL must not exceed 255 characters")
    @Pattern(regexp = "^(https?://).+", message = "Platform URL must start with http:// or https://")
    private String platformUrl;

    @NotNull(message = "Course ID is required")
    private UUID courseId;

    @NotNull(message = "Language code is required")
    private LanguageCode languageCode;

    private List<String> participants;
}
