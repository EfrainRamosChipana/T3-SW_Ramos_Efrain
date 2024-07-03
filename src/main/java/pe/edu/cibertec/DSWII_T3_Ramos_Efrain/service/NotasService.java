package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd.Notas;
import pe.edu.cibertec.DSWII_T3_Ramos_Efrain.repository.NotasRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class NotasService implements INotasService {

    //Para listar las notasDetalle
    private NotasRepository notasRepository;
    @Override
    public List<Notas> listarNotasConDetalles() {
        return notasRepository.findAll();
    }
}