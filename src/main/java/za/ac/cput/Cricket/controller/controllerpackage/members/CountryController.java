package za.ac.cput.Cricket.controller.controllerpackage.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.records.Country;
import za.ac.cput.Cricket.service.records.impl.CountryServiceImp;

import java.util.Set;

@RestController
@RequestMapping("country")
public class CountryController {
    @Autowired
    private CountryServiceImp  countryServiceImp;

    @PostMapping
    public Country create(@RequestBody Country t){
        return countryServiceImp.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Country findById(@PathVariable String id){
        return countryServiceImp.read(id);
    }
    @PutMapping("/update")
    public Country update(@RequestBody Country t){
        return countryServiceImp.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        countryServiceImp.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Country> getAll(){
        return countryServiceImp.getAll();
    }

}
