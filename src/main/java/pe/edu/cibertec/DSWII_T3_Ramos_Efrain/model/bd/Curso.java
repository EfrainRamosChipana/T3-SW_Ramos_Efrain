package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "curso")
public class Curso {
    //Tabla Curso
    @Id
    @Column(name = "idcurso")
    private String idCurso;
    @Column(name = "nomcurso")
    private String nomCurso;
    @Column(name = "credito")
    private Integer credito;
}