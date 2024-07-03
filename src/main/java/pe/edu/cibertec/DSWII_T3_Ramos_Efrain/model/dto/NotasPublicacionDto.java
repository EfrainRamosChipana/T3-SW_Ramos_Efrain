package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.dto;

import lombok.Data;

@Data
public class NotasPublicacionDto implements DtoEntity {
    private Float exaParcial;
    private Float exaFinal;
    private String nombreCurso;
    private String apellidoAlumno;
    private String nombreAlumno;
}