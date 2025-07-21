package uz.consortgroup.core.api.v1.dto.user.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TranslationDto {
    @NotBlank(message = "Title cannot be blank")
    @Size(max = 300, message = "Title cannot exceed 255 characters")
    private String title;

    @NotBlank(message = "Message cannot be blank")
    @Size(max = 2000, message = "Message cannot exceed 2000 characters")
    private String message;
}
