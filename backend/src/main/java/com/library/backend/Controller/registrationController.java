package com.library.backend.Controller;

import com.library.backend.Entity.registrationRequest;
import com.library.backend.Service.registrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/registration")
@AllArgsConstructor
public class registrationController {

    private registrationService registrationService;

    @PostMapping
    public String register(@RequestBody registrationRequest request){
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token){
        return registrationService.confirmToken(token);
    }
}
