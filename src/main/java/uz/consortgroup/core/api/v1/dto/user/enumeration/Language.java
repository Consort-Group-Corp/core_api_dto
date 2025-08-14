package uz.consortgroup.core.api.v1.dto.user.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(name = "Language", description = "Язык. В JSON сериализуется как RU/EN/UZ/UZK/KAA", example = "RU")
public enum Language {
    ENGLISH("en"),
    RUSSIAN("ru"),
    UZBEK_CYRILLIC("uzk"),
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
