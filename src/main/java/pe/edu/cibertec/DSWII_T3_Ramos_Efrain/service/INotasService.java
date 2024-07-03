package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.service;

import pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd.Notas;

import java.util.List;

public interface INotasService {

    List<Notas> listarNotasConDetalles();
}