package za.ac.cput.Cricket.controller.controllerpackage.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.members.Coach;
import za.ac.cput.Cricket.service.members.CoachServiceImp;

import java.util.Set;

@RestController
@RequestMapping("/coach")
public class CoachController {

    @Autowired
    private CoachServiceImp coachServiceImp;

    @PostMapping("/new")
    public Coach create(@RequestBody Coach coach){

        return coachServiceImp.create(coach);
    }

    @GetMapping(path = "/find/{id}")
    public Coach findById(@PathVariable String id){

        Coach coach = coachServiceImp.read(id);

        return coach;
    }
    @PutMapping("/update")
    public void update(@RequestBody Coach doc){

        coachServiceImp.update(doc);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        coachServiceImp.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Coach> getAll(){
        return coachServiceImp.getAll();
    }
}
