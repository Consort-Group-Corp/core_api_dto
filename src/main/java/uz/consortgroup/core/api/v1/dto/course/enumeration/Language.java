package uz.consortgroup.core.api.v1.dto.course.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Language", description = "Язык. В JSON сериализуется как RU/EN/UZ", example = "RU")
public enum Language {
    RUSSIAN("RU"),
    ENGLISH("EN"),
    UZBEK("UZ");

    private final String value;

    Language(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static Language fromValue(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Language value must not be null");
        }

        value = value.trim().replace("\"", "");

        for (Language language : Language.values()) {
            if (language.value.equalsIgnoreCase(value)) {
                return language;
            }
        }

        throw new IllegalArgumentException("Unknown language: " + value);
    }

}