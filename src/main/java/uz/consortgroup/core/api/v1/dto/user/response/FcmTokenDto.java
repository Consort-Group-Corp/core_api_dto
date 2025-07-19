package uz.consortgroup.core.api.v1.dto.user.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.DeviceType;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FcmTokenDto {
    private UUID userId;
    private Language language;
    private String fcmToken;
    private DeviceType deviceType;
}
