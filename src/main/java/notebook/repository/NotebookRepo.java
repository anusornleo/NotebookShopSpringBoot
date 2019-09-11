package notebook.repository;

import notebook.model.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebookRepo extends CrudRepository<Notebook ,Integer > {
}
