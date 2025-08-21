package uz.consortgroup.core.api.v1.dto.forum;

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
@Schema(name = "Ид созданной форумной группы", description = "Результат создания форумной группы")
public class HrForumGroupCreateResponse {

    @Schema(description = "Идентификатор созданной группы", format = "uuid",
            pattern = UUID_PATTERN_SCHEMA)
    private UUID groupId;
}
