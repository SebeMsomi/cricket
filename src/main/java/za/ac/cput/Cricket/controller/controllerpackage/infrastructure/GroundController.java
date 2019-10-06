package za.ac.cput.Cricket.controller.controllerpackage.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Cricket.domain.infrastructure.Ground;
import za.ac.cput.Cricket.service.infrastructure.GroundService;


public class GroundController {
//    @Autowired
//    private GroundService groundService;
//
//    @PostMapping(value = "/create/{gender}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createGender(@PathVariable String gender) {
//        System.out.println("Entered Value: " + gender);
//        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Gender created!");
//        Gender savedGender;
//        if (gender == null || gender.trim().isEmpty() || gender.trim().equalsIgnoreCase("null")) {
//            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            responseObj.setResponseDescription("Provide a gender!");
//        } else {
//            savedGender = groundService.retrieveByDesc(gender);
//            if (savedGender != null) {
//                responseObj.setResponseDescription("Gender already exist!");
//            } else {
//                savedGender = GenderFactory.buildGender(gender);
//                savedGender = groundService.create(savedGender);
//            }
//            responseObj.setResponse(savedGender);
//        }
//        return ResponseEntity.ok(responseObj);
    }
//
//    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity getAll(){
//        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
//        List<Ground> genders = groundService.getAll();
//        responseObj.setResponse(genders);
//        return ResponseEntity.ok(responseObj);
//    }
//
// }
