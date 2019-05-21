package za.ac.cput.Cricket.controller.controllerpackage.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.records.Fast;
import za.ac.cput.Cricket.service.cricket.records.FastServiceImp;

import java.util.Set;

@RestController
@RequestMapping("fast")
public class FastController {
    @Autowired
    private FastServiceImp fastServiceImp;

    @PostMapping
    public Fast create(@RequestBody Fast t){
        return fastServiceImp.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Fast findById(@PathVariable String id){
        return fastServiceImp.read(id);
    }
    @PutMapping("/update")
    public Fast update(@RequestBody Fast t){
        return fastServiceImp.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        fastServiceImp.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Fast> getAll(){
        return fastServiceImp.getAll();
    }
}
