package notebook;

import notebook.service.NotebookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class NotebookApplication {

//    NotebookService notebookService = new NotebookService();

    public static void main(String[] args) {
        SpringApplication.run(NotebookApplication.class, args);
    }

//    @RequestMapping()
//    String home() {
//        return "Welcome to NotebookShop";
//    }
//
//    @RequestMapping(value = "/notebook",method = RequestMethod.GET)
//    public List<Notebook> showAllNotebook() {
//        return notebookService.showAllNotebook();
//    }
//
//    @RequestMapping(value = "/notebook/{id}",method = RequestMethod.GET)
//    public Notebook showNotebook(@PathVariable int id) {
//        return notebookService.getNotebook(id);
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public ResponseEntity<Notebook> addNotebook(@RequestBody Notebook notebook) {
//        Notebook notebook1 = notebookService.addNotebook(notebook);
//        return ResponseEntity.status(HttpStatus.CREATED).body(notebookService.addNotebook(notebook1));
//    }

}
