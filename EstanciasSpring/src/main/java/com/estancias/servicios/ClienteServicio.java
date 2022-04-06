package com.estancias.servicios;

import com.estancias.entidades.Cliente;
import com.estancias.entidades.Usuario;
import com.estancias.repositorios.ClienteRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServicio {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Autowired
    UsuarioServicio usuarioServicio;

    @Transactional(rollbackFor = {Exception.class})
    public Cliente crear(String nombre, String calle, int numero, String codPostal, String ciudad, String pais, String email, String idUsuario) throws Exception {

        validarCliente(nombre, calle, codPostal, ciudad, pais, email);
        Cliente cliente = new Cliente();

        cliente.setNombre(nombre);
        cliente.setCalle(calle);
        cliente.setNumero(numero);
        cliente.setCodPostal(codPostal);
        cliente.setCiudad(ciudad);
        cliente.setPais(pais);
        cliente.setEmail(email);

        Usuario usuario = usuarioServicio.buscarPorId(idUsuario);
        cliente.setUsuario(usuario);

        clienteRepositorio.save(cliente);

        return cliente;

    }

    @Transactional(rollbackFor = {Exception.class})
    public void modificar(String id, String nombre, String calle, int numero, String codPostal, String ciudad, String pais, String email, String idUsuario) throws Exception {

        validarCliente(nombre, calle, codPostal, ciudad, pais, email);
        Optional<Cliente> respuesta = clienteRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Cliente cliente = respuesta.get();

            cliente.setNombre(nombre);
            cliente.setCalle(calle);
            cliente.setNumero(numero);
            cliente.setCodPostal(codPostal);
            cliente.setCiudad(ciudad);
            cliente.setPais(pais);
            cliente.setEmail(email);

            Usuario usuario = usuarioServicio.buscarPorId(idUsuario);
            cliente.setUsuario(usuario);

            clienteRepositorio.save(cliente);

        } else {
            throw new Exception("No se encontro el cliente buscado");
        }
    }

    @Transactional(readOnly = true)
    public List<Cliente> listarClientes() {

        return clienteRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Cliente> listarId(String id) {
        return clienteRepositorio.findById(id);
    }

    public void eliminarCliente(String id) {

        clienteRepositorio.deleteById(id);
    }

    public Cliente buscarPorId(String id) throws Exception {

        Optional<Cliente> respuesta = clienteRepositorio.findById(id);

        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new Exception("No existe la casa buscada");
        }

    }

    private void validarCliente(String nombre, String calle, String codPostal, String ciudad, String pais, String email) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede ser nulo");
        }

        if (calle == null || calle.isEmpty()) {
            throw new Exception("La calle no puede ser nula");
        }

        if (codPostal == null || codPostal.isEmpty()) {
            throw new Exception("El codigo postal no puede ser nulo");
        }

        if (ciudad == null || ciudad.isEmpty()) {
            throw new Exception("La ciudad  no puede ser nula");
        }

        if (pais == null || pais.isEmpty()) {
            throw new Exception("El pais no puede ser nulo");
        }
        if (email == null || email.isEmpty()) {
            throw new Exception("El email no puede ser nulo");
        }

    }
}
