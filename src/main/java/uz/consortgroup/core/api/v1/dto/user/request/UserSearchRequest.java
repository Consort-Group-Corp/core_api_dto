package uz.consortgroup.core.api.v1.dto.user.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserSearchRequest {
    @NotBlank(message = "Query is required")
    @Size(min = 7, message = "Query must be at least 7 characters")
    private String query;
}
