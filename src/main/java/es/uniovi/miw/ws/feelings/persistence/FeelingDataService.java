package es.uniovi.miw.ws.feelings.persistence;

import java.util.List;

import es.uniovi.miw.ws.feelings.model.Feeling;

/**
 * Abstracción de la capa de Persistencia
 * 
 * @author Daniel Machado Fernández / Natalia García Menéndez
 * 
 */
public interface FeelingDataService {

    /**
     * Obtiene todos los sentimientos del mes ordenados ascendentemente por
     * fecha
     * 
     * @return una lista de {@link Feeling}
     */
    List<Feeling> findAll();

}