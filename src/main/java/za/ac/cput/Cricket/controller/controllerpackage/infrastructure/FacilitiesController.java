package za.ac.cput.Cricket.controller.controllerpackage.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.service.cricket.infrastructure.FacilityServiceImp;

import java.util.Set;

@RestController
@RequestMapping("facilities")
public class FacilitiesController {
    @Autowired
    private FacilityServiceImp facilityServiceImp;

    @PostMapping
    public Facilities create(@RequestBody Facilities t){
        return facilityServiceImp.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Facilities findById(@PathVariable String id){
        return facilityServiceImp.read(id);
    }
    @PutMapping("/update")
    public Facilities update(@RequestBody Facilities t){
        return facilityServiceImp.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        facilityServiceImp.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Facilities> getAll(){
        return facilityServiceImp.getAll();
    }
}
