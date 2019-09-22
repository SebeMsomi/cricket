package za.ac.cput.Cricket.controller.controllerpackage.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.members.Batsman;
import za.ac.cput.Cricket.factory.members.Batsmanfactories;
import za.ac.cput.Cricket.service.members.BatsmanService;

import java.util.Set;

@RestController
@RequestMapping("/batsman")
public class BatsmanController {
    @Autowired

    private BatsmanService service;

    @GetMapping("/create/{batsman}")
    public @ResponseBody
     Batsman create(@PathVariable  String batsman) {
       Batsman batsman1 = Batsmanfactories.getBatsman("1",50);
       return service.create(batsman1);
    }

    @PostMapping("/update")
    @ResponseBody
    public Batsman update(Batsman batsman) {
        return service.update(batsman);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Batsman read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Batsman> getAll(){
        return service.getAll();
    }
}
