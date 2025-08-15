package uz.consortgroup.core.api.v1.dto.constants;

public final class SchemaPatterns {

    private SchemaPatterns() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static final String UUID_PATTERN_SCHEMA =
        "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[1-5][0-9a-fA-F]{3}-[89abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12}$";
}
