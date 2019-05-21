package za.ac.cput.Cricket.controller.controllerpackage;

import za.ac.cput.Cricket.domain.Cricket;
import za.ac.cput.Cricket.factory.CricketFactory;
import za.ac.cput.Cricket.service.cricket.cricket.impl.CricketServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("cricket")
public class CricketController {
    @Autowired
    private CricketServiceImp cricketServiceImp;

    @GetMapping("/create/{cricketName}")

    public @ResponseBody
    Cricket create(@PathVariable String team1, String team2) {
        Cricket cricket = CricketFactory.getCricket(team1,team2);

        return cricketServiceImp.create(cricket);
    }
    @GetMapping(path = "/find/{id}")
    public Cricket findById(@PathVariable String id){
        return cricketServiceImp.read(id);
    }
    @PutMapping("/update")
    public Cricket update(@RequestBody Cricket t){
        return cricketServiceImp.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        cricketServiceImp.delete(id);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Cricket> getAll(){
        return cricketServiceImp.getAll();
    }
}
