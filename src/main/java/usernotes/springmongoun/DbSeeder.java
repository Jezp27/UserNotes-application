package usernotes.springmongoun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private UserRepository userR;


    public DbSeeder(UserRepository userR) {
        this.userR = userR;
    }
    @Override
    public void run(String... strings) throws Exception{
        User u1= new User("MariaDB", Arrays.asList(new Note("27/02/2018", "MariaDB", "Important Tasks"), new Note("27/02/2018", "MariaDB", "Things to do")));
        User u2= new User("ThomasHU", Arrays.asList(new Note("03/03/2018", "ThomasHU", "Homeworks: English activity")));
        User u3= new User("JackieOh", Arrays.asList(new Note("04/03/2018", "JackieOH", "Activities")));

        this.userR.deleteAll();
        List<User> users= Arrays.asList(u1,u2,u3);
        this.userR.saveAll(users);


    }
}
