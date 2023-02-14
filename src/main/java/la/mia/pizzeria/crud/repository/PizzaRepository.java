package la.mia.pizzeria.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import la.mia.pizzeria.crud.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
