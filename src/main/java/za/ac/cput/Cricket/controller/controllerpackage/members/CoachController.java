package za.ac.cput.Cricket.controller.controllerpackage.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.members.Coach;
import za.ac.cput.Cricket.service.members.impl.CoachServiceImp;

import java.util.Set;



public class CoachController {

  /*
    private CoachServiceImp ServiceImpl;

    @PostMapping("/new")
    public Coach create(@RequestBody Coach coach){

        return ServiceImpl.create(coach);
    }

    @GetMapping(path = "/find/{id}")
    public Coach findById(@PathVariable String id){

        Coach coach = ServiceImpl.read(id);

        return coach;
    }

    @PutMapping("/update")
    public void update(@RequestBody Coach coach){

        ServiceImpl.update(coach);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        ServiceImpl.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Coach> getAll(){
        return ServiceImpl.getAll();
    }
*/

}
