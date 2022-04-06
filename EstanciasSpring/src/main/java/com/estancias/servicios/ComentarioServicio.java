package com.estancias.servicios;

import com.estancias.entidades.Comentario;
import com.estancias.repositorios.ComentarioRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ComentarioServicio {

    @Autowired
    ComentarioRepositorio comentarioRepositorio;

    @Transactional(rollbackFor = {Exception.class})
    public Comentario crear(String descripcion) throws Exception {

        validarComentario(descripcion);
        Comentario comentario = new Comentario();

        comentario.setDescripcion(descripcion);

        comentarioRepositorio.save(comentario);

        return comentario;

    }

    @Transactional(rollbackFor = {Exception.class})
    public void modificar(String id, String descripcion) throws Exception {
        validarComentario(descripcion);
        Optional<Comentario> respuesta = comentarioRepositorio.findById(id);

        if (respuesta.isPresent()) {
         
              Comentario comentario = respuesta.get();

            comentario.setDescripcion(descripcion);

            comentarioRepositorio.save(comentario);

        } else {

            throw new Exception("No se encontro el comentario buscado");
        }
    }

    @Transactional(readOnly = true)
    public List<Comentario> listarComentario() {

        return comentarioRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Comentario> listarId(String id) {
        return comentarioRepositorio.findById(id);
    }

    public void eliminarComentario(String id) {

        comentarioRepositorio.deleteById(id);
    }

    public Comentario buscarPorId(String id) throws Exception {

        Optional<Comentario> respuesta = comentarioRepositorio.findById(id);

        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new Exception("No existe el comentario buscado");
        }

    }

    private void validarComentario(String descripcion) throws Exception {

        if (descripcion == null || descripcion.isEmpty()) {
            throw new Exception("La descripcion no puede ser nula");
        }

    }

}
