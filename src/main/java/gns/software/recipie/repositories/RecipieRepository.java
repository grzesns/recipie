package gns.software.recipie.repositories;

import gns.software.recipie.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipieRepository extends CrudRepository<Recipe, Long> {
}
