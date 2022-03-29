package estancias.servicios;

import estancias.entidades.Casa;
import estancias.persistencia.CasaDAO;
import java.util.Collection;

public class CasaServicio {

    private CasaDAO dao;

    public CasaServicio() {
        this.dao = new CasaDAO();
    }

    public Collection<Casa> listarCasas() throws Exception {
        try {

            Collection<Casa> casas = dao.listarCasas();

            return casas;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirCasas() throws Exception {

        try {

            Collection<Casa> casas = listarCasas();

            if (casas.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Casa u : casas) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Casa> listarPorPrecio() throws Exception {
        try {

            Collection<Casa> casas = dao.listarPorPrecio();

            return casas;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirPorPrecio() throws Exception {

        try {

            Collection<Casa> casas = listarPorPrecio();

            if (casas.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Casa u : casas) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Casa> listarPorPais() throws Exception {
        try {

            Collection<Casa> casas = dao.listarPorPais();

            return casas;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirPorPais() throws Exception {

        try {

            Collection<Casa> casas = listarPorPais();

            if (casas.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Casa u : casas) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Casa> listarPorComentario() throws Exception {
        try {

            Collection<Casa> casas = dao.listarPorComentario();

            return casas;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirPorComentario() throws Exception {

        try {

            Collection<Casa> casas = listarPorComentario();

            if (casas.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Casa u : casas) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
