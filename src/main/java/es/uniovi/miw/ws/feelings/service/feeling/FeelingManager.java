package es.uniovi.miw.ws.feelings.service.feeling;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uniovi.miw.ws.feelings.model.Feeling;
import es.uniovi.miw.ws.feelings.persistence.FeelingDataService;
import es.uniovi.miw.ws.feelings.service.FeelingService;

/**
 * Implementación que proporciona las operaciones de la capa de negocio
 * 
 * @author Daniel Machado Fernández / Natalia García Menéndez
 * 
 */
@Service
public class FeelingManager implements FeelingService {

    private static Logger logger = LoggerFactory
	    .getLogger(FeelingManager.class);

    @Autowired
    private FeelingDataService feelingDataService;

    public List<Feeling> findAll() {
	logger.info("Service - Obteniendo Feelings...");
	return feelingDataService.findAll();
    }

}
