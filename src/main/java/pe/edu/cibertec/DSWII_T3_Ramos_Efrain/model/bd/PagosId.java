package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PagosId implements java.io.Serializable {
    private String idAlumno;
    private String ciclo;
    private Integer ncuota;
}
