package uz.consortgroup.core.api.v1.dto.forum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HrForumGroupCreateResponse {
    private UUID groupId;
}
