package com.estancias.servicios;

import com.estancias.entidades.Casa;
import com.estancias.entidades.Familia;
import com.estancias.entidades.Usuario;
import com.estancias.repositorios.FamiliaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FamiliaServicio {

    @Autowired
    FamiliaRepositorio familiaRepositorio;

    @Autowired
    UsuarioServicio usuarioServicio;

    @Autowired
    CasaServicio casaServicio;

    @Transactional(rollbackFor = {Exception.class})
    public Familia crear(String nombre, int edadMin, int edadMax, int numHijos, String email, String idUsuario, String idCasa) throws Exception {

        validarFamilia(nombre, email);
        Familia familia = new Familia();

        familia.setNombre(nombre);
        familia.setEdadMin(edadMin);
        familia.setEdadMax(edadMax);
        familia.setNumHijos(numHijos);
        familia.setEmail(email);

        Usuario usuario = usuarioServicio.buscarPorId(idUsuario);
        familia.setUsuario(usuario);

        Casa casa = casaServicio.buscarPorId(idCasa);
        familia.setCasa(casa);

        familiaRepositorio.save(familia);

        return familia;

    }

    @Transactional(rollbackFor = {Exception.class})
    public void modificar(String id, String nombre, int edadMin, int edadMax, int numHijos, String email, String idUsuario, String idCasa) throws Exception {

        validarFamilia(nombre, email);
        Optional<Familia> respuesta = familiaRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Familia familia = respuesta.get();

            familia.setNombre(nombre);
            familia.setEdadMin(edadMin);
            familia.setEdadMax(edadMax);
            familia.setNumHijos(numHijos);
            familia.setEmail(email);

            Usuario usuario = usuarioServicio.buscarPorId(idUsuario);
            familia.setUsuario(usuario);

            Casa casa = casaServicio.buscarPorId(idCasa);
            familia.setCasa(casa);

            familiaRepositorio.save(familia);

        } else {
            throw new Exception("No se encontro la familia buscada");
        }
    }

    @Transactional(readOnly = true)
    public List<Familia> listarFamilias() {

        return familiaRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Familia> listarId(String id) {
        return familiaRepositorio.findById(id);
    }

    public void eliminarFamilia(String id) {

        familiaRepositorio.deleteById(id);
    }

    private void validarFamilia(String nombre, String email) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede ser nulo");
        }

        if (email == null || email.isEmpty()) {
            throw new Exception("El email no puede ser nulo");
        }

    }
}
