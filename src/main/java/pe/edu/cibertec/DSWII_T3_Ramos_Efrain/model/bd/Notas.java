package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notas")
@IdClass(NotasId.class)
public class Notas {
    //Tabla  notas
    @Id
    @Column(name = "idalumno")
    private String idAlumno;
    @Id
    @Column(name = "idcurso")
    private String idCurso;
    @Column(name = "exaparcial")
    private Float exaParcial;
    @Column(name = "exafinal")
    private Float exaFinal;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idalumno", insertable = false, updatable = false)
    private Alumno alumno;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcurso", insertable = false, updatable = false)
    private Curso curso;
}