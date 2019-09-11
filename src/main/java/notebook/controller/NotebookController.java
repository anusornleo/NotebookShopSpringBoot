package notebook.controller;

import notebook.repository.NotebookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import notebook.model.Notebook;
import notebook.service.NotebookService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
@Configuration

public class NotebookController {

    @Autowired
    private NotebookRepo notebookRepo;

    @RequestMapping("/")
    String home() {
        return "<h1>Welcome from controller</h1>";
    }

    @RequestMapping(value = "/notebook", method = RequestMethod.GET)
    public List<Notebook> allNotebook() {
        return (List<Notebook>) notebookRepo.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNotebook(@RequestBody Notebook notebook){
        Notebook n = new Notebook();
        n.setId(notebook.getId());
        n.setBrand(notebook.getBrand());
        n.setModel(notebook.getModel());
        n.setPrice(notebook.getPrice());
        notebookRepo.save(n);
        return "notebook id "+n.getId()+" Saved";
    }

    @RequestMapping(value = "/notebook/{id}",method = RequestMethod.GET)
    public Notebook showNotebook(@PathVariable int id) {
        Optional<Notebook> getNotebook = notebookRepo.findById(id);
        return getNotebook.get();
    }

    @RequestMapping(value = "/notebook/{id}", method = RequestMethod.PUT)
    public String updateNotebook(@PathVariable int id, @RequestBody Notebook notebook) {
        Optional<Notebook> getNotebook = notebookRepo.findById(id);
        if(getNotebook.isPresent()){
            notebook.setId(id);
            Optional.of(notebookRepo.save(notebook));
            return "Update Done!";
        }
        return "id not found";
    }

    @RequestMapping(value = "notebook/delete/{id}",method = RequestMethod.DELETE)
    public String deleteNotebook(@PathVariable int id){
        notebookRepo.deleteById(id);
        return "Notebook "+id+" has been Delete";
    }

    @RequestMapping(value = "notebook/reset",method = RequestMethod.DELETE)
    public String resetNotebook(){
        notebookRepo.deleteAll();
        return "Notebook catalog has been reset";
    }
}
