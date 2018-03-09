package usernotes.springmongoun;

import org.springframework.data.annotation.Id;

public class Note {
    @Id
    private String id1;
    private String date;
    private String user;
    private String text;

    protected Note(){

    }

    public Note(String Date, String User, String Text){
        this.date= Date;
        this.user= User;
        this.text= Text;
    }

    public String getId() {
        return id1;
    }

    public String getDate(){
        return user;
    }

    public String getUser(){
        return user;
    }

    public String getText(){
        return text;
    }
}
