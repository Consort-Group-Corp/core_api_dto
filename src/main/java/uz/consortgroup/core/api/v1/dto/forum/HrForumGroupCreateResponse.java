package uz.consortgroup.core.api.v1.dto.forum;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "HrForumGroupCreateResponse", description = "Результат создания форумной группы")
public class HrForumGroupCreateResponse {

    @Schema(description = "Идентификатор созданной группы", format = "uuid",
            example = "8b2f9b6d-0b3a-4c68-9d5e-1a2b3c4d5e6f")
    private UUID groupId;
}
