package org.davo.davo.firstAPI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public ResponseEntity<String> helloEndpointMethod(){
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/hello")
    public ResponseEntity helloWorldWithNameMethod(@RequestBody NameDTO nameDTO){
        return ResponseEntity.ok("Hello " + nameDTO.getName());
    }
}