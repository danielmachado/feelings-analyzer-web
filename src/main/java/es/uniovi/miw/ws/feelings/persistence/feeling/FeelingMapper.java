package es.uniovi.miw.ws.feelings.persistence.feeling;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import es.uniovi.miw.ws.feelings.model.Feeling;

/**
 * Mapper para el modelo {@link Feeling} que traduce el Registro de la base de
 * datos en un VO
 * 
 * @author Daniel Machado Fernández / Natalia García Menéndez
 * 
 */
@Repository
public class FeelingMapper implements RowMapper<Feeling> {

    private static Logger logger = LoggerFactory.getLogger(FeelingMapper.class);

    public Feeling mapRow(ResultSet rs, int rowNum) throws SQLException {
	Feeling feeling = new Feeling();
	feeling.setId(rs.getLong("id"));
	feeling.setPuntOld(rs.getDouble("puntOld"));
	feeling.setPuntNew(rs.getDouble("puntNew"));
	feeling.setDate(rs.getDate("date_"));

	logger.info("Mapper - Binding completado con éxito: " + feeling);

	return feeling;
    }

}
