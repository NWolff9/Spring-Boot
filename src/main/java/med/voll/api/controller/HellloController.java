package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HellloController {

    @GetMapping
    public static String olaMundo() {
        return ("tetsando o a pagina");
    }
}
