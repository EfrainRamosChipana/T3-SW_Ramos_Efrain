package pe.edu.cibertec.DSWII_T3_Ramos_Efrain.controller;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.bd.Notas;
import pe.edu.cibertec.DSWII_T3_Ramos_Efrain.model.dto.NotasPublicacionDto;
import pe.edu.cibertec.DSWII_T3_Ramos_Efrain.service.INotasService;

import java.util.List;
import java.util.stream.Collectors;

@PreAuthorize("hasRole('Administrador')")
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/notas")
public class NotasController {

    private final INotasService iNotasService;
    private final ModelMapper modelMapper;

    @GetMapping("/pubs-dto")
    public ResponseEntity<List<NotasPublicacionDto>> listarNotasPublicacionDto() {
        List<Notas> notas = iNotasService.listarNotasConDetalles();
        List<NotasPublicacionDto> notasDto = notas.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());

        if(notasDto.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(notasDto, HttpStatus.OK);
    }
    private NotasPublicacionDto convertToDto(Notas notas) {
        NotasPublicacionDto dto = modelMapper.map(notas, NotasPublicacionDto.class);
        dto.setNombreCurso(notas.getCurso().getNomCurso());
        dto.setApellidoAlumno(notas.getAlumno().getApeAlumno());
        dto.setNombreAlumno(notas.getAlumno().getNomAlumno());
        return dto;
    }
}

