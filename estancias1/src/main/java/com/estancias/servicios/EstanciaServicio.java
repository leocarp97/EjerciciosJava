package com.estancias.servicios;

import com.estancias.entidades.Casa;
import com.estancias.entidades.Cliente;
import com.estancias.entidades.Estancia;
import com.estancias.repositorios.EstanciaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstanciaServicio {

    @Autowired
    EstanciaRepositorio estanciaRepositorio;

    @Autowired
    ClienteServicio clienteServicio;

    @Autowired
    CasaServicio casaServicio;

    public Estancia crear(String huesped, String fechaDesde, String fechaHasta, String idCliente, String idCasa) throws Exception {

        Estancia estancia = new Estancia();

        estancia.setHuesped(huesped);
        estancia.setFechaDesde(fechaDesde);
        estancia.setFechaHasta(fechaHasta);
        Cliente cliente = clienteServicio.buscarPorId(idCliente);
        estancia.setCliente(cliente);
        Casa casa = casaServicio.buscarPorId(idCasa);
        estancia.setCasa(casa);

        estanciaRepositorio.save(estancia);

        return estancia;

    }

    public void modificar(String id, String huesped, String fechaDesde, String fechaHasta, String idCliente, String idCasa) throws Exception {

        Optional<Estancia> respuesta = estanciaRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Estancia estancia = new Estancia();

            estancia.setHuesped(huesped);
            estancia.setFechaDesde(fechaDesde);
            estancia.setFechaHasta(fechaHasta);
            Cliente cliente = clienteServicio.buscarPorId(idCliente);
            estancia.setCliente(cliente);
            Casa casa = casaServicio.buscarPorId(idCasa);
            estancia.setCasa(casa);

            estanciaRepositorio.save(estancia);

        } else {
            throw new Exception("No se encontro la estancia buscada");
        }

    }

    @Transactional(readOnly = true)
    public List<Estancia> listarEstancias() {

        return estanciaRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Estancia> listarId(String id) {
        return estanciaRepositorio.findById(id);
    }

    public void eliminarEstancia(String id) {

        estanciaRepositorio.deleteById(id);
    }

}
