package uz.consortgroup.core.api.v1.dto.user.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.DeviceType;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDeviceTokenResponse {
    private UUID userId;
    private UUID id;
    private String fcmToken;
    private DeviceType deviceType;
    private String appVersion;
    private String deviceInfo;
    private Boolean isActive;
    private LocalDateTime lastSeen;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
