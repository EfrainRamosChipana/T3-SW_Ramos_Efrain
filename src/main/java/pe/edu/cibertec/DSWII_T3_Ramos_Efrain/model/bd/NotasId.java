package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd;


import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotasId implements java.io.Serializable {
    @Column(name = "idalumno")
    private String idAlumno;
    @Column(name = "idcurso")
    private String idCurso;
}
