package uz.consortgroup.core.api.v1.dto.forum.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Создание запрещенного слова")
public class ForbiddenWordCreateRequestDto {
    @Schema(description = "Плохое слово", example = "@#$%@#$%!!")
    @NotBlank(message = "Word is required")
    private String word;
}
