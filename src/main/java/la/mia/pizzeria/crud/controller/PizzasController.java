package la.mia.pizzeria.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import la.mia.pizzeria.crud.model.Pizza;
import la.mia.pizzeria.crud.repository.PizzaRepository;

@Controller
@RequestMapping("/")
public class PizzasController {

	@Autowired
	PizzaRepository PizzaRepository;
	
//	@GetMapping
//	public String index(Model model) {
//		List<Pizza> elencoPizze=PizzaRepository.findAll();
//		model.addAttribute("elencoPizze",elencoPizze);
//		return "index";
//	}
	
	@GetMapping
	public String index(@RequestParam(name = "input", required = false) String input, Model model) {
		List<Pizza> elencoPizze;

////		TEST
//		input = "marghe";
////		TEST		
//		http://localhost:8080/?input=mar
		
		if (input != null && !input.isEmpty()) {
			elencoPizze = PizzaRepository.findByNameLike("%" + input + "%");
		} else {
			elencoPizze = PizzaRepository.findAll();
		}
		model.addAttribute("elencoPizze", elencoPizze);
		return "index";
	}

	@GetMapping("/{id}")
	public String singlePizza(@PathVariable("id") Integer id, Model model) {
		Pizza detailPizza = PizzaRepository.getReferenceById(id);
		
//			model.addAttribute("Error", "Pizza non trovata");
//			return "redirect:/index";

		model.addAttribute("pizza", detailPizza);

		return "show";

	}
	
}
