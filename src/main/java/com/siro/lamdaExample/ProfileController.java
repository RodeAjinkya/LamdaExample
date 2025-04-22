package com.siro.lamdaExample;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProfileController {
        @GetMapping(value = "users", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<User> getUsers(){
            return  List.of(new User("Ajinkya","Rode","Ajinkya.rode@siro.com"),
                    new User("Siya","Rode","Siya.rode@siro.com"));
        }
}
