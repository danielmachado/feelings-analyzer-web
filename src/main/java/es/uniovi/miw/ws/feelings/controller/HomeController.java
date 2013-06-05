package es.uniovi.miw.ws.feelings.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.uniovi.miw.ws.feelings.model.Feeling;
import es.uniovi.miw.ws.feelings.service.FeelingService;

/**
 * Controlador único que mapea las dos url's disponibles de la aplicación
 * 
 * @author Daniel Machado Fernández / Natalia García Menéndez
 * 
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory
	    .getLogger(HomeController.class);
    @Autowired
    private FeelingService feelingService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
	logger.info("Controller - Entrando en Home...");

	List<Feeling> feelings = feelingService.findAll();

	model.addAttribute("feelings", feelings);

	return "home";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Locale locale, Model model) {

	logger.info("Controller - Entrando en About Us...");

	return "about";
    }

}
