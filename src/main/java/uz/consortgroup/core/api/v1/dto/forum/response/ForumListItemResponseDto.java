package uz.consortgroup.core.api.v1.dto.forum.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.ForumAccessType;

import java.time.Instant;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(name = "ForumListItem", description = "Краткая информация о форуме")
public class ForumListItemResponseDto {

    @Schema(description = "ID форума", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "Название форума", example = "Курс по Java")
    private String title;

    @Schema(description = "Автор форума")
    private ForumAuthorDto author;

    @Schema(description = "Дата создания (UTC, ISO-8601)", example = "2025-08-22T09:30:00Z")
    private Instant createdAt;

    @Schema(description = "Количество комментариев", example = "5")
    private Long commentsCount;

    @Schema(description = "Количество лайков", example = "12")
    private Long likesCount;

    @Schema(description = "Тип доступа", example = "OPEN", allowableValues = {"OPEN", "CLOSED"})
    private ForumAccessType accessType;

    @Schema(description = "URL превью-картинки", example = "https://cdn.example.com/covers/java.png")
    private String previewImageUrl;
}