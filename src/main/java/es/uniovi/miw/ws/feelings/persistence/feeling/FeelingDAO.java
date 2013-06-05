package es.uniovi.miw.ws.feelings.persistence.feeling;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import es.uniovi.miw.ws.feelings.model.Feeling;
import es.uniovi.miw.ws.feelings.persistence.FeelingDataService;

/**
 * Implementa la fachada Data Service del modelo {@link Feeling}
 * 
 * @author Daniel Machado Fernández / Natalia García Menéndez
 * 
 */
public class FeelingDAO implements FeelingDataService {

    private static Logger logger = LoggerFactory.getLogger(FeelingDAO.class);

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
	logger.info("Persistence - Inyectando dataSource...");
	this.dataSource = dataSource;
	jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Feeling> findAll() {

	logger.info("Persistence - Buscando sentimientos en la Base de Datos...");

	String SQL = "select * from feelings order by date_ asc";
	List<Feeling> feelings = jdbcTemplate.query(SQL, new FeelingMapper());

	logger.info("Persistence - Sentimientos encontrados.");

	return feelings;
    }

}
