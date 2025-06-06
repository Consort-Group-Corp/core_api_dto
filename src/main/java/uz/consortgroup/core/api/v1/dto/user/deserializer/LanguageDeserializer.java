package uz.consortgroup.core.api.v1.dto.user.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import uz.consortgroup.core.api.v1.dto.user.enumeration.Language;

import java.io.IOException;

public class LanguageDeserializer extends JsonDeserializer<Language> {

    @Override
    public Language deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String code = p.getText();
        return Language.fromCode(code);
    }
}
