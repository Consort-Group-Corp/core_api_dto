package uz.consortgroup.core.api.v1.dto.user.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotNull(message = "Created by user ID cannot be null")
    private UUID createdByUserId;

    @NotNull(message = "Creator role cannot be null")
    private CreatorRole creatorRole;

    @NotNull(message = "Communication method cannot be null")
    private Communication communication;

    @FutureOrPresent(message = "Send date must be in the present or future")
    private LocalDateTime sendAt;

    @NotNull(message = "Active status cannot be null")
    private Boolean active;

    @NotEmpty(message = "Recipient user IDs cannot be empty")
    @Size(min = 1, max = 100, message = "Recipient user IDs must contain between 1 and 100 items")
    private List<UUID> recipientUserIds;

    @NotEmpty(message = "Translations cannot be empty")
    @Valid
    private Map<Language, TranslationDto> translations;
}
