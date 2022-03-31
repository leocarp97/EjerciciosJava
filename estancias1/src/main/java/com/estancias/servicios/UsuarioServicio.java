package com.estancias.servicios;



import com.estancias.entidades.Usuario;
import com.estancias.repositorios.UsuarioRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

     @Transactional(rollbackFor = {Exception.class})
    public Usuario crear(String alias, String email, String clave, String fechaAlta, String fechaBaja) {

        Usuario usuario = new Usuario();

        usuario.setAlias(alias);
        usuario.setEmail(email);
        usuario.setClave(clave);
        usuario.setFechaAlta(fechaAlta);
        usuario.setFechaBaja(fechaBaja);

        usuarioRepositorio.save(usuario);

        return usuario;

    }

    public Usuario buscarPorId(String id) throws Exception {

        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new Exception("No existe el cliente buscado");
        }

    }
     @Transactional(rollbackFor = {Exception.class})
    public void modificar(String id, String alias, String email, String clave, String fechaAlta, String fechaBaja) throws Exception {

        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Usuario usuario = new Usuario();

            usuario.setAlias(alias);
            usuario.setEmail(email);
            usuario.setClave(clave);
            usuario.setFechaAlta(fechaAlta);
            usuario.setFechaBaja(fechaBaja);

            usuarioRepositorio.save(usuario);

        } else {
            throw new Exception("mo se encontro el usuario buscado");
        }

    }
  
        @Transactional(readOnly = true)
    public List<Usuario> listarUsuarios() {

        return usuarioRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Usuario> listarId(String id) {
        return usuarioRepositorio.findById(id);
    }

    public void eliminarUsuario(String id) {

        usuarioRepositorio.deleteById(id);
    }
    
    
}
