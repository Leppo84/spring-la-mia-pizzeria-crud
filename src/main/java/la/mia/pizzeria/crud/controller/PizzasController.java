package la.mia.pizzeria.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import la.mia.pizzeria.crud.model.Pizza;
import la.mia.pizzeria.crud.repository.PizzaRepository;

@Controller
@RequestMapping("/")
public class PizzasController {

	@Autowired
	PizzaRepository PizzaRepository;
	
	@GetMapping
	public String index(Model model) {
		List<Pizza> elencoPizze=PizzaRepository.findAll();
		model.addAttribute("elencoPizze",elencoPizze);
		return "index";
	}
	
}
