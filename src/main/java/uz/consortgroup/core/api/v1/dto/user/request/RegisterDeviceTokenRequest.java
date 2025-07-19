package uz.consortgroup.core.api.v1.dto.user.request;

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
    private String fcmToken;
    @NotBlank(message = "Device type is required")
    private DeviceType deviceType;
    @NotNull(message = "Language is required")
    private Language language;
    private String appVersion;
    private String deviceInfo;
}
