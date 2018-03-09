package usernotes.springmongoun;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private NoteRepository noteR;

    public NoteController(NoteRepository noteR) {
        this.noteR = noteR;
    }

    @GetMapping("/all")
    public List<Note> getNotes(){
        List<Note> Notes= this.noteR.findAll();
        return Notes;
    }

    @PutMapping
    public void insertNote(@RequestBody Note note){
        this.noteR.insert(note);
    }

    @PostMapping
    public void updateNote(@RequestBody Note note){
        this.noteR.save(note);
    }

    @DeleteMapping
    public void deleteNote(Note note){
       this.noteR.delete(note);
    }

}
