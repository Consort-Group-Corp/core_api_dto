package uz.consortgroup.core.api.v1.dto.webinar.response;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@Schema(description = "Список вебинаров")
public class WebinarListPageResponse {

    @ArraySchema(arraySchema = @Schema(description = "Список вебинаров"),
            minItems = 1,
            maxItems = 100)
    private List<WebinarListItemResponseDto> webinars;

    @Schema(description = "Пустой ли список")
    private boolean empty;

    @Schema(description = "Сообщение")
    private String message;

    @Schema(description = "Номер страницы")
    private int totalPages;

    @Schema(description = "Общее количество элементов")
    private long totalElements;
}
