package uz.consortgroup.core.api.v1.dto.user.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Communication;
import uz.consortgroup.core.api.v1.dto.user.enumeration.CreatorRole;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationCreateRequestDto {

    private UUID createdByUserId;

    private CreatorRole creatorRole;

    private Communication communication;

    private LocalDateTime sendAt;

    private Boolean active;

    private List<UUID> recipientUserIds;

    private Map<Language, TranslationDto> translations;
}
