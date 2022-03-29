package com.libreria.servicios;

import com.libreria.entidades.Cliente;
import com.libreria.repositorios.ClienteRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteServicio {

    @Autowired
    ClienteRepositorio clienteRepositorio;

   
    public Cliente crear(Long documento, String nombre, String apellido, String telefono, Boolean alta) throws Exception {

        validarCliente(documento,nombre,apellido,telefono);
        
        Cliente cliente = new Cliente();

        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        cliente.setAlta(alta);

        clienteRepositorio.save(cliente);

        return cliente;
    }

    public Cliente buscarPorId(String id) throws Exception {
        Optional<Cliente> respuesta = clienteRepositorio.findById(id);

        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new Exception("No existe el cliente buscado");
        }
    }

    public void modificar(String id, Long documento, String nombre, String apellido, String telefono, Boolean alta) throws Exception {

         validarCliente(documento,nombre,apellido,telefono);
        
        Optional<Cliente> respuesta = clienteRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Cliente cliente = respuesta.get();

            cliente.setDocumento(documento);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setTelefono(telefono);
            cliente.setAlta(alta);

            clienteRepositorio.save(cliente);

        } else {
            throw new Exception("No se encontro el cliente buscado");
        }

    }

    public List<Cliente> listarCliente() {

        return clienteRepositorio.findAll();
    }

    public void eliminarCliente(String id) {
        clienteRepositorio.deleteById(id);
    }

    public void deshabilitar(String id) throws Exception {
        Optional<Cliente> respuesta = clienteRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Cliente cliente = respuesta.get();

            cliente.setAlta(false);

            clienteRepositorio.save(cliente);

        } else {
            throw new Exception("No se encontro el cliente buscado");
        }

    }

    private void validarCliente(Long documento, String nombre, String apellido, String telefono) throws Exception {

        if (documento == null) {
            throw new Exception("El documento no puede ser nulo");
        }

        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede ser nulo");
        }

        if (apellido == null || apellido.isEmpty()) {
            throw new Exception("El apellido no puede ser nulo");
        }

        if (telefono == null || telefono.isEmpty()) {
            throw new Exception("El telefono no puede ser nulo");
        }

    }
}
