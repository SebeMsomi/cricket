package za.ac.cput.Cricket.controller.controllerpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.Drink;
import za.ac.cput.Cricket.service.cricket.cricket.impl.DrinkServiceImp;

import java.util.Set;

@RestController
@RequestMapping("drink")
public class DrinkController {
    @Autowired
    private DrinkServiceImp countryServiceImp;

    @PostMapping
    public Drink create(@RequestBody Drink t){
        return countryServiceImp.create(t);
    }
    @GetMapping(path = "/find/{id}")
    public Drink findById(@PathVariable String id){
        return countryServiceImp.read(id);
    }
    @PutMapping("/update")
    public Drink update(@RequestBody Drink t){
        return countryServiceImp.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        countryServiceImp.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Drink> getAll(){
        return countryServiceImp.getAll();
    }
}
