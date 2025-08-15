package uz.consortgroup.core.api.v1.dto.webinar.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "LanguageCode", description = "Язык. В JSON сериализуется как RU/EN/UZ/UZK/KAA")
public enum LanguageCode {
    RU("ru"),
    UZ("uz"),
    UZ_CYR("uzk"),
    ENG("en"),
    QAR("kaa");

    private final String code;

    LanguageCode(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    @JsonCreator
    public static LanguageCode fromCode(String code) {
        for (LanguageCode lc : values()) {
            if (lc.code.equalsIgnoreCase(code)) {
                return lc;
            }
        }
        throw new IllegalArgumentException("Unknown language code: " + code);
    }
}
