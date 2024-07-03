package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.service;

import pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}
