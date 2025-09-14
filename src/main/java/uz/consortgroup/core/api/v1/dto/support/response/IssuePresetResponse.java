package uz.consortgroup.core.api.v1.dto.support.response;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(name = "IssuePresetResponse", description = "Короткий ответ с пресетом для UI")
public class IssuePresetResponse {
    @Schema(description = "ID пресета", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "Текст пресета", example = "Не получается сохранить курс")
    private String text;
}
