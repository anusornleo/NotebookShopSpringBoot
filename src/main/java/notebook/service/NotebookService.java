package notebook.service;

import notebook.NotebookFac;
import notebook.model.Notebook;
import notebook.repository.NotebookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class NotebookService {

    private static List<Notebook> notebooklist = new ArrayList<Notebook>();

    @Autowired
    private NotebookRepo notebookRepo;

    public List<Notebook> showAllNotebook(){
        return notebooklist;
    }

    public Notebook getNotebook(int id){
        for (Notebook notebook:notebooklist){
            if (notebook.getId() == id){
                return notebook;
            }
        }
        return null;
    }

    public Notebook addNotebook(Notebook notebook){
        notebooklist.add(NotebookFac.createNotebook(notebook.getId(),notebook.getBrand(),notebook.getModel(),notebook.getPrice()));
        return notebook;
    }

}
