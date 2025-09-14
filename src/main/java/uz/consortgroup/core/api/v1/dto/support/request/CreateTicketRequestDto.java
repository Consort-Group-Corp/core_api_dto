package uz.consortgroup.core.api.v1.dto.support.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "CreateTicketRequest", description = "Запрос на создание тикета в техподдержку")
public class CreateTicketRequestDto {
    @Schema(description = "ID выбранного пресета (если выбран)", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID selectedIssueId;

    @Size(max = 500)
    @Schema(description = "Комментарий пользователя (если пресет не выбран — обязателен)", maxLength = 500, example = "Кнопка «Сохранить» не реагирует")
    private String comment;

    @AssertTrue(message = "Either selectedIssueId or comment must be provided")
    @Schema(hidden = true)
    public boolean isEitherProvided() {
        return selectedIssueId != null || (comment != null && !comment.isBlank());
    }
}
