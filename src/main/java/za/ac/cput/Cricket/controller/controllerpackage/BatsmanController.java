package za.ac.cput.Cricket.controller.controllerpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.Batsman;
import za.ac.cput.Cricket.service.cricket.serviceInterface.BatsmanService;

import java.util.Set;

@RestController
@RequestMapping("/batsman")
public class BatsmanController {
    @Autowired
    private BatsmanService service;

    @PostMapping("/create")
    @ResponseBody
    public Batsman create(Batsman batsman) {
        return service.create(batsman);
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

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Batsman> getAll() {
        return service.getAll();
    }

}
