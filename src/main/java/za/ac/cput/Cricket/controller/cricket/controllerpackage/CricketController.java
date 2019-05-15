package za.ac.cput.Cricket.controller.cricket.controllerpackage;

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
    private CricketServiceImp service;

    @GetMapping("/create/{cricketName}")

    public @ResponseBody
    Cricket create(@PathVariable String team1, String team2) {
        Cricket cricket = CricketFactory.getCricket(team1,team2);

        return service.create(cricket);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Cricket> getAll(){
        return service.getAll();
    }
}
