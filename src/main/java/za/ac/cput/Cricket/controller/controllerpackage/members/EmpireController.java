package za.ac.cput.Cricket.controller.controllerpackage.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.members.Empire;
import za.ac.cput.Cricket.service.members.impl.EmpireServiceImp;

import java.util.Set;

//@RestController
//@RequestMapping("empire")
public class EmpireController {
   /* @Autowired
    private EmpireServiceImp empireServiceImp;

    @PostMapping
    public Empire create(@RequestBody Empire t){
        return empireServiceImp.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Empire findById(@PathVariable String id){
        return empireServiceImp.read(id);
    }
    @PutMapping("/update")
    public Empire update(@RequestBody Empire t){
        return empireServiceImp.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        empireServiceImp.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Empire> getAll(){
        return empireServiceImp.getAll();
    }*/
}
