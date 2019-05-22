package za.ac.cput.Cricket.controller.controllerpackage.recess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.recess.Break;
import za.ac.cput.Cricket.service.members.BreakServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/breaki")
public class BreakController {
    @Autowired
    @Qualifier("BreakServiceImpl")
    private BreakServiceImpl breakServiceImp;

    @PostMapping("/new")
    public Break create(@RequestBody Break breaki){

        return breakServiceImp.create(breaki);
    }
    @GetMapping(path = "/find/{id}")
    public Break findById(@PathVariable String id){

        Break aBreak = breakServiceImp.read(id);
        return aBreak;
    }
    @PutMapping("/update")
    public void update(@RequestBody Break account){

        breakServiceImp.update(account);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        breakServiceImp.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Break> getAll(){
        return breakServiceImp.getAll();
    }
}
