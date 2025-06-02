package uz.consortgroup.core.api.v1.dto.user.oneid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OneIdUserResponse {
    private String token;
    private UUID userId;
    private String firstName;
    private String lastName;
    private String email;
}
