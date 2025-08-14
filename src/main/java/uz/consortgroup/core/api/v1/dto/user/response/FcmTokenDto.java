package uz.consortgroup.core.api.v1.dto.user.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import uz.consortgroup.core.api.v1.dto.user.enumeration.DeviceType;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "FcmToken", description = "Описывает зарегистрированный FCM-токен устройства пользователя")
public class FcmTokenDto {

    @Schema(description = "ID пользователя, владельца токена", example = "8a0b7d1a-0f74-4a7d-8c8d-0e9f0b1c2d3e")
    private UUID userId;

    @Schema(description = "Язык пользователя, связанный с токеном", example = "ru",
            allowableValues = {"ru","uz","uzk","en"})
    private Language language;

    @Schema(description = "Значение FCM-токена", example = "fcm_abcdef123456")
    private String fcmToken;

    @Schema(description = "Тип устройства", example = "ANDROID")
    private DeviceType deviceType;
}
