package uz.consortgroup.core.api.v1.dto.forum.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForbiddenWordResponseDto {
    private UUID id;
    private String word;
    private boolean active;
    private UUID createdBy;
    private Instant createdAt;
    private Instant updatedAt;
}
