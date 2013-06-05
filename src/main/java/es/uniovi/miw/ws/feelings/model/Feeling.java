package es.uniovi.miw.ws.feelings.model;

import java.util.Date;

/**
 * Modelo de la aplicación, representa el sentimiento de un Tweet
 * 
 * @author Daniel Machado Fernández / Natalia García Menéndez
 * 
 */
public class Feeling {

    private Long id;
    private Date date;
    private Double puntOld;
    private Double puntNew;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Date getDate() {
	return date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public Double getPuntOld() {
	return puntOld;
    }

    public void setPuntOld(Double puntOld) {
	this.puntOld = puntOld;
    }

    public Double getPuntNew() {
	return puntNew;
    }

    public void setPuntNew(Double puntNew) {
	this.puntNew = puntNew;
    }

    @Override
    public String toString() {
	return "Feeling [id=" + id + ", date=" + date + ", puntOld=" + puntOld
		+ ", puntNew=" + puntNew + "]";
    }

    public Feeling(Long id, Date date, Double puntOld, Double puntNew) {
	super();
	this.id = id;
	this.date = date;
	this.puntOld = puntOld;
	this.puntNew = puntNew;
    }

    public Feeling() {
	super();
	// TODO Auto-generated constructor stub
    }

}
