package uz.consortgroup.core.api.v1.dto.user.auth;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.deserializer.LanguageDeserializer;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoginRequest {
    @JsonDeserialize(using = LanguageDeserializer.class)
    private Language language;
    private String email;
    private String password;
}
