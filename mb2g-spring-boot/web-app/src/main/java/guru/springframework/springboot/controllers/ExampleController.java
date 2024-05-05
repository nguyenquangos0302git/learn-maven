package guru.springframework.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class ExampleController {

    @GetMapping()
    public Map<String, Object> getIndex() {
        Map<String, Object> result = new HashMap<>();

        result.put("Hello", "World");

        return result;
    }

}
