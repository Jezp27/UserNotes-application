package usernotes.springmongoun;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.SimpleDateFormat;
import java.util.Date;

@Document(collection = "Notes")
public class Note {

    @Id
    private String id;
    private String date;
    private String username;
    private String text;

    protected Note(){

    }


    public Note(String User, String Text){
        Date actDate = new Date();
        this.date = new SimpleDateFormat("dd-MM-yyyy").format(actDate);
        this.username= User;
        this.text= Text;
    }

    public String getId() {
        return id;
    }

    public String getDate(){
        return date;
    }

    public String getUsername(){
        return username;
    }

    public String getText(){
        return text;
    }
}
