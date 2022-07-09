package com.martarello.teste.resources;

import com.martarello.teste.entidades.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findUsers(){
        User u = new User(1L, "Matheus", "matheus@email.com", "4646464646", "1234");

        return ResponseEntity.ok().body(u);
    }

}
