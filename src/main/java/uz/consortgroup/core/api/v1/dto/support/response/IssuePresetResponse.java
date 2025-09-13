package uz.consortgroup.core.api.v1.dto.support.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class IssuePresetResponse {
    private UUID id;
    private String text;
}
