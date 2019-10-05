package za.ac.cput.Cricket.controller.controllerpackage.records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.records.Results;
import za.ac.cput.Cricket.service.records.impl.ResultServiceImp;

import java.util.Set;

@RestController
@RequestMapping("/result")
public class ResultsController {
//    @Autowired
//    private ResultServiceImp reportService;
//
//    @PostMapping("/new")
//    public Results create(@RequestBody Results t) {
//        return reportService.create(t);
//    }
//
//    @GetMapping(path = "/find/{id}")
//    public Results findById(@PathVariable String id) {
//        return reportService.read(id);
//    }
//
//    @PutMapping("/update")
//    public Results update(@RequestBody Results t) {
//        return reportService.update(t);
//    }
//
//    @DeleteMapping(path = "/delete/{id}")
//    public void delete(@PathVariable String id) {
//        reportService.delete(id);
//    }
//
//    @GetMapping("/getall")
//    public Set<Results> getAll() {
//        return reportService.getAll();
//    }
}