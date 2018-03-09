package usernotes.springmongoun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private UserRepository userR;
    private NoteRepository noteR;


    public DbSeeder(UserRepository userR, NoteRepository noteR) {
        this.userR = userR;
        this.noteR = noteR;
    }

    @Override
    public void run(String... strings) throws Exception{
        Note n1= new Note("MariaDB", "Important Tasks");
        Note n2= new Note("MariaDB", "Things to do");
        Note n3= new Note("ThomasHU", "Homeworks: English activity");
        Note n4= new Note( "JackieOH", "Activities");
        User u1= new User("MariaDB", Arrays.asList(n1,n2));
        User u2= new User("ThomasHU", Arrays.asList(n3));
        User u3= new User("JackieOh", Arrays.asList(n4));


        this.userR.deleteAll();
        List<User> users= Arrays.asList(u1,u2,u3);
        this.userR.saveAll(users);
        List<Note> notes= Arrays.asList(n1,n2,n3,n4);
        this.noteR.saveAll(notes);

    }
}
