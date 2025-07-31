package uz.consortgroup.core.api.v1.dto.user.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserBulkSearchRequest {

    @Size(max = 50, message = "Maximum 50 users can be searched at once")
    @NotEmpty(message = "Users search list cannot be empty, need email or pinfl to search")
    @Valid
    private List<UserSearchRequest> queries;
}
