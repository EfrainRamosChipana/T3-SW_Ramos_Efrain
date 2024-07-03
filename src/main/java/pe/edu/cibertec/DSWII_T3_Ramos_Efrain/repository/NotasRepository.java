package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd.Notas;
import pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd.NotasId;

@Repository
public interface NotasRepository extends JpaRepository<Notas, NotasId> {

}