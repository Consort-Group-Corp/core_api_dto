package uz.consortgroup.core.api.v1.dto.oneid;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OneIdProfile {
    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("sur_name")
    private String surName;

    @JsonProperty("mid_name")
    private String midName;

    @JsonProperty("pin")
    private String pin;

    @JsonProperty("email")
    private String email;

    @JsonProperty("mobile_phone")
    private String phoneNumber;
}
