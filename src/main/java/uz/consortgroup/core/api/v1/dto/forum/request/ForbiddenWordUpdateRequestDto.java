package uz.consortgroup.core.api.v1.dto.forum.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForbiddenWordUpdateRequestDto {
    private String word;
    private Boolean active;
}
