package uz.consortgroup.core.api.v1.dto.user.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.DeviceType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RegisterDeviceTokenRequest {
    @NotBlank(message = "Fcm token is required")
    private String fcmToken;
    @NotBlank(message = "Device type is required")
    private DeviceType deviceType;
    private String appVersion;
    private String deviceInfo;
}
