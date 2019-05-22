package za.ac.cput.Cricket.controller.controllerpackage.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.infrastructure.Ground;
import za.ac.cput.Cricket.factory.infrastructure.GroundFactory;
import za.ac.cput.Cricket.service.infrastructure.GroundServiceImp;

import java.util.Set;

@RestController
@RequestMapping("ground")
public class GroundController {
    @Autowired
    private GroundServiceImp groundServiceImp;

    @GetMapping("/create/{groundName}")

    public @ResponseBody
    Ground create(@PathVariable int size,int capacity, String groundId) {
        Ground cricket = GroundFactory.getGround(size,capacity,groundId);

        return groundServiceImp.create(cricket);
    }
    @GetMapping(path = "/find/{id}")
    public Ground findById(@PathVariable String id){
        return groundServiceImp.read(id);
    }
    @PutMapping("/update")
    public Ground update(@RequestBody Ground t){
        return groundServiceImp.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        groundServiceImp.delete(id);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Ground> getAll(){
        return groundServiceImp.getAll();
    }
}
