package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.dto;

import lombok.Data;

@Data
public class NotasDto implements DtoEntity  {
    private String idAlumno;
    private String idCurso;
    private Float exaParcial;
    private Float exaFinal;
    private Float promedio;


}