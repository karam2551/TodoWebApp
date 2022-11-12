package to.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import to.model.Todo;

@Repository
public interface ToDoRepository extends JpaRepository<Todo, Integer>{

}
