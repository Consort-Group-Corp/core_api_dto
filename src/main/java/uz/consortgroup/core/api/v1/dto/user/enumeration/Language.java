package uz.consortgroup.core.api.v1.dto.user.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum Language {
    ENGLISH("en"),
    RUSSIAN("ru"),
    UZBEK_CYRILLIC("uz_cy"),
    UZBEK("uz"),
    KARAKALPAK("kaa");

    private final String code;

    Language(String code) {
        this.code = code;
    }

    @JsonValue
    public String toCode() {
        return code;
    }

    @JsonCreator
    public static Language fromCode(String code) {
        for (Language language : values()) {
            if (language.getCode().equalsIgnoreCase(code)) {
                return language;
            }
        }
        throw new IllegalArgumentException("Unknown language code: " + code);
    }
}
