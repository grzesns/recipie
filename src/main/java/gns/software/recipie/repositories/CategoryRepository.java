package gns.software.recipie.repositories;

import gns.software.recipie.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
