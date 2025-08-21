package uz.consortgroup.core.api.v1.dto.forum;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumAccessByGroupRequest {

    @NotNull(message = "User ID is required")
    private UUID userId;

    @NotNull(message = "Group ID is required")
    private UUID groupId;
}