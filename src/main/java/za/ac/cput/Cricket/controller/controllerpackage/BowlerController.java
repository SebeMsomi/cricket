package za.ac.cput.Cricket.controller.controllerpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.Bowler;
import za.ac.cput.Cricket.service.cricket.serviceInterface.BowlerService;

import java.util.Set;

@RestController
@RequestMapping
public class BowlerController {
    @Autowired

    private BowlerService service;
    @PostMapping("/create")
    @ResponseBody
    public Bowler create(Bowler bowler) {
        return service.create(bowler);
    }
    @PostMapping("/update")
    @ResponseBody
    public Bowler update(Bowler bowler) {
        return service.update(bowler);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Bowler read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Bowler> getAll() {
        return service.getAll();
    }
}
