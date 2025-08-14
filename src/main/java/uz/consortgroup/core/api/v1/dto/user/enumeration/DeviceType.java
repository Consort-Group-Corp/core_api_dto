package uz.consortgroup.core.api.v1.dto.user.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Тип устройства, с которого пришел FCM-токен")
public enum DeviceType {
    ANDROID,
    IOS,
    WEB
}
