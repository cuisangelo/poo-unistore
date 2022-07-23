package uni.edu.pe.backendv3ladefinitiva.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRespuesta {
    private String status;
    private String response;
}
