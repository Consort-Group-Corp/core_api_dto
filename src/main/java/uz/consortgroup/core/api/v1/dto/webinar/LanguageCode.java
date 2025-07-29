package uz.consortgroup.core.api.v1.dto.webinar;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
