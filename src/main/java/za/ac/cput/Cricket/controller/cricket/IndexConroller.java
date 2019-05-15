package za.ac.cput.Cricket.controller.cricket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class IndexConroller {
    @GetMapping("/")
    @ResponseBody

    public String getCrickets() {
        return " Protea ";
    }
}
