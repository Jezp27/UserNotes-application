package usernotes.springmongoun;


import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepository userR;

    public UserController(UserRepository userR) {
        this.userR = userR;
    }

    @GetMapping("/all")
    public List<User> getUsers() {
        List<User> Users= this.userR.findAll();
        return Users;
    }

    @PutMapping
    public void insertUser(@RequestBody User user){
        this.userR.insert(user);
    }

    @PostMapping
    public void updateUser(@RequestBody User user){
        this.userR.save(user);
    }

    @DeleteMapping
    public void deleteUser(User user){
       this.userR.delete(user);
    }

    //@GetMapping("/{id}")
    //public User getById(@PathVariable("id") String id) {
     //   Optional <User> us1 =this.userR.findById(id);
      //      return us1;


    //}
}
