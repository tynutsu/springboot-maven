package demo.rest.controller;

import demo.model.MSDEMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/1.0")
public class MSDEMessageController {

    @GetMapping("/hi")
    public MSDEMessage hi() {
        return new MSDEMessage();
    }

}
