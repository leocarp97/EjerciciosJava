package com.estancias.servicios;

import com.estancias.entidades.Casa;
import com.estancias.entidades.Comentario;
import com.estancias.repositorios.CasaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CasaServicio {

    @Autowired
    CasaRepositorio casaRepositorio;

    @Autowired
    ComentarioServicio comentarioServicio;

    @Transactional(rollbackFor = {Exception.class})
    public Casa crear(String calle, int numero, String codPostal, String ciudad, String pais, String fechaDesde, String fechaHasta, int minDias, int maxDias, double precio, String tipoVivienda, String idDescripcion) throws Exception {

        validarCasa(calle, codPostal, ciudad, pais, tipoVivienda);
        Casa casa = new Casa();

        casa.setCalle(calle);
        casa.setNumero(numero);
        casa.setCodPostal(codPostal);
        casa.setCiudad(ciudad);
        casa.setPais(pais);
        casa.setFechaDesde(fechaDesde);
        casa.setFechaHasta(fechaHasta);
        casa.setMinDias(minDias);
        casa.setMaxDias(maxDias);
        casa.setPrecio(precio);
        casa.setTipoVivienda(tipoVivienda);
        Comentario comentario = comentarioServicio.buscarPorId(idDescripcion);

        casa.setComentario(comentario);

        casaRepositorio.save(casa);

        return casa;

    }

    @Transactional(rollbackFor = {Exception.class})
    public void modificar(String id, String calle, int numero, String codPostal, String ciudad, String pais, String fechaDesde, String fechaHasta, int minDias, int maxDias, double precio, String tipoVivienda, String idDescripcion) throws Exception {
        validarCasa(calle, codPostal, ciudad, pais, tipoVivienda);
        Optional<Casa> respuesta = casaRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Casa casa = respuesta.get();

            casa.setCalle(calle);
            casa.setNumero(numero);
            casa.setCodPostal(codPostal);
            casa.setCiudad(ciudad);
            casa.setPais(pais);
            casa.setFechaDesde(fechaDesde);
            casa.setFechaHasta(fechaHasta);
            casa.setMinDias(minDias);
            casa.setMaxDias(maxDias);
            casa.setPrecio(precio);
            casa.setTipoVivienda(tipoVivienda);

            Comentario comentario = comentarioServicio.buscarPorId(idDescripcion);

            casa.setComentario(comentario);

            casaRepositorio.save(casa);

        } else {
            throw new Exception("No se encontro la casa buscada");
        }
    }

    @Transactional(readOnly = true)
    public List<Casa> listarCasas() {

        return casaRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Casa> listarId(String id) {
        return casaRepositorio.findById(id);
    }

    public void eliminarCasa(String id) {

        casaRepositorio.deleteById(id);
    }

    public Casa buscarPorId(String id) throws Exception {

        Optional<Casa> respuesta = casaRepositorio.findById(id);

        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new Exception("No existe la casa buscada");
        }

    }

    private void validarCasa(String calle, String codPostal, String ciudad, String pais, String tipoVivienda) throws Exception {

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
        if (tipoVivienda == null || tipoVivienda.isEmpty()) {
            throw new Exception("El tipo de vivienda no puede ser nulo");
        }
    }
}
