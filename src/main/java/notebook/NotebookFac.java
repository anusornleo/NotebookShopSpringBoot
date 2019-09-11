package notebook;

import notebook.model.Notebook;

public class NotebookFac {
    public static Notebook createNotebook(int id, String brand,String model,double price){
        return new Notebook(id, brand,model,price);
    }
}
