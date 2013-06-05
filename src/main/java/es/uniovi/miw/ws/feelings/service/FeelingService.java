package es.uniovi.miw.ws.feelings.service;

import java.util.List;

import es.uniovi.miw.ws.feelings.model.Feeling;

/**
 * Fachada de la capa de negocio
 * 
 * @author Daniel Machado Fernández / Natalia García Menéndez
 * 
 */
public interface FeelingService {

    /**
     * Obtiene todos los sentimientos de la capa de persistencia
     * 
     * @return listado de {@link Feeling} ordenados por fecha
     */
    List<Feeling> findAll();

}