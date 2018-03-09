package usernotes.springmongoun;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Users")
public class User {
    @Id
    private String Id;
    private String name;
    private List<Note> notes;


    protected User(){

    }

    public User(String Name, List<Note> Note){
        this.name=Name;
        this.notes=Note;
    }

    public String getId() {
        return Id;
    }

    public String getName(){
        return name;
    }

    public List<Note> getNotes() {
        return notes;
    }
}
