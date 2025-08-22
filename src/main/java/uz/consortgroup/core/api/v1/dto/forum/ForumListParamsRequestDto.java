package uz.consortgroup.core.api.v1.dto.forum;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.AccessFilter;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.CreatedAtSort;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.SortDir;

import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "ForumListParamsRequest", description = "Query-параметры для получения списка форумов")
public class ForumListParamsRequestDto {

    @Schema(description = "Строка поиска по названию форума", example = "java")
    private String search;

    @Schema(
            description = "Фильтр по типу доступа. ALL — не фильтровать",
            example = "OPEN",
            defaultValue = "ALL",
            allowableValues = {"ALL", "OPEN", "CLOSED"}
    )
    private AccessFilter accessFilter;

    @Schema(description = "Фильтр по идентификатору ментора", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID mentorId;

    @Schema(
            description = "Сортировка по числу комментариев (задаёт направление). Укажи либо этот параметр, либо likesCount",
            example = "DESC",
            allowableValues = {"ASC", "DESC"}
    )
    private SortDir commentsCount;

    @Schema(
            description = "Сортировка по числу лайков (задаёт направление). Укажи либо этот параметр, либо commentsCount",
            example = "ASC",
            allowableValues = {"ASC", "DESC"}
    )
    private SortDir likesCount;

    @Schema(
            description = "Сортировка по дате создания",
            example = "NEWEST",
            defaultValue = "NEWEST",
            allowableValues = {"NEWEST", "OLDEST"}
    )
    private CreatedAtSort createdAt;

    @Min(value = 1, message = "Page must be at least 1")
    @Schema(description = "Номер страницы (начиная с 1)", example = "1", minimum = "1", defaultValue = "1")
    private Integer page;

    @Min(value = 1, message = "Limit must be at least 1")
    @Max(value = 100, message = "Limit must be at most 100")
    @Schema(description = "Размер страницы", example = "10", minimum = "1", maximum = "100", defaultValue = "20")
    private Integer limit;
}
