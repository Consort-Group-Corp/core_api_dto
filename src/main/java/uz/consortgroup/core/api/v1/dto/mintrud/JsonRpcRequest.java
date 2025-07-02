package uz.consortgroup.core.api.v1.dto.mintrud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JsonRpcRequest {
    private final String jsonrpc = "2.0";
    private String id;
    private String method;
    private Map<String, Object> params;
}
