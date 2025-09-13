package uz.consortgroup.core.api.v1.dto.support.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PresetResponse {
    private UUID id;
    private UserRole role;
    private String text;
    private Integer sortOrder;
    private boolean active;
}