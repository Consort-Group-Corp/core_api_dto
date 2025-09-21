package uz.consortgroup.core.api.v1.dto.forum.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "ForumListResponse", description = "Страница результатов по форумам")
public class ForumListResponseDto {
    @Schema(description = "Общее количество записей", example = "42")
    private Long total;

    @Schema(description = "Номер страницы (1..∞)", example = "1")
    private Integer page;

    @Schema(description = "Размер страницы", example = "10")
    private Integer limit;

    @Schema(description = "Список форумов")
    private List<ForumListItemResponseDto> data;
}