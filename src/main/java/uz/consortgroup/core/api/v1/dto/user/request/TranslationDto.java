package uz.consortgroup.core.api.v1.dto.user.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(name = "Translation", description = "Локализованный контент уведомления")
public class TranslationDto {

    @Schema(description = "Заголовок сообщения", example = "Новый урок доступен",
            maxLength = 300, requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "Title cannot be blank")
    @Size(max = 300, message = "Title cannot exceed 255 characters")
    private String title;

    @Schema(description = "Текст сообщения", example = "Откройте приложение, чтобы посмотреть материал",
            maxLength = 2000, requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "Message cannot be blank")
    @Size(max = 2000, message = "Message cannot exceed 2000 characters")
    private String message;
}
