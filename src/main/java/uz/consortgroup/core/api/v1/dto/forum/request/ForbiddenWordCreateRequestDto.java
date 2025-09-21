package uz.consortgroup.core.api.v1.dto.forum.request;

import jakarta.validation.constraints.NotBlank;
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
public class ForbiddenWordCreateRequestDto {
    @NotBlank(message = "Word is required")
    private String word;

    @NotNull(message = "CreatedBy is required")
    private UUID createdBy;
}
