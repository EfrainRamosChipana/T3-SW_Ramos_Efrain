package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alumno")
public class Alumno {
    //Tabla Alumno
    @Id
    @Column(name = "idalumno")
    private String idAlumno;
    @Column(name = "apealumno")
    private String apeAlumno;
    @Column(name = "nomalumno")
    private String nomAlumno;
    @ManyToOne
    @JoinColumn(name = "idesp")
    private Especialidad especialidad;
    @Column(name = "proce")
    private String proce;
}
