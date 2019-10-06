package za.ac.cput.Cricket.controller.controllerpackage.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.members.Batsman;
import za.ac.cput.Cricket.factory.members.Batsmanfactories;
import za.ac.cput.Cricket.service.members.BatsmanService;

import java.util.Set;

@RestController
@RequestMapping("/appointment")
@CrossOrigin(origins = "http://localhost:8080")
public class BatsmanController {

    @Autowired
    @Qualifier("BatsmanServiceImpl")
    private BatsmanService service;

    @PostMapping("/new")
    public Batsman create(@RequestBody Batsman batsman){

        return service.create(batsman);
    }
    @GetMapping(path = "/find/{id}")
    public Batsman findById(@PathVariable String id){

        Batsman account = service.read(id);
        return account;
    }

    @PutMapping("/update")
    public void update(@RequestBody Batsman account){

        service.update(account);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Batsman read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    public Set<Batsman> getAll(){
        return service.getAll();
    }
}
