package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "especialidad")
public class Especialidad {
    //Tabla Especialidad
    @Id
    @Column(name = "idesp")
    private String idEsp;
    @Column(name = "nomesp")
    private String nomEsp;
    @Column(name = "costo")
    private Double costo;
}
