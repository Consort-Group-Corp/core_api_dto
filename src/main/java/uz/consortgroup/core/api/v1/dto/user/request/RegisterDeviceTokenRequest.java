package uz.consortgroup.core.api.v1.dto.user.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.DeviceType;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RegisterDeviceTokenRequest {
    @NotBlank(message = "Fcm token is required")
    @Schema(description = "FCM-токен, полученный от Firebase", example = "fcm_abcdef123456")
    private String fcmToken;

    @NotBlank(message = "Device type is required")
    @Schema(description = "Тип устройства, с которого пришел FCM-токен", example = "ANDROID")
    private DeviceType deviceType;

    @NotNull(message = "Language is required")
    @Schema(description = "Язык интерфейса пользователя", example = "ru")
    private Language language;

    @Schema(description = "Версия приложения", example = "1.0.0")
    private String appVersion;

    @Schema(description = "Информация о устройстве", example = "Android 10")
    private String deviceInfo;
}
