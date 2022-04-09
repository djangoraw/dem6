
package com.example.demo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

@Controller
public class UsersController {

    private final Map<Integer,UserEntity> users = Map.of(1,new UserEntity("Tim"), 2, new UserEntity("Jim"));

    @GetMapping("/users/all")
    public ResponseEntity<Collection<UserEntity>> getApiUser2() {
        return ResponseEntity.ok(users.values());
    }

    @GetMapping("/users/{id}/get")
    public ResponseEntity<UserEntity> getApiUser2(
            @PathVariable("id") int id

    ) {
        return ResponseEntity.of(Optional.ofNullable(users.get(id)));
    }

}
