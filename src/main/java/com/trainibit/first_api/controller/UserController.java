package com.trainibit.first_api.controller;

import com.trainibit.first_api.request.UserRequestPost;
import com.trainibit.first_api.request.UserRequestPut;
import com.trainibit.first_api.response.UserResponse;
import com.trainibit.first_api.service.UserService;
<<<<<<< HEAD
=======
import jakarta.validation.Valid;
>>>>>>> c572bc0 (primera api)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/users")
public class UserController {
<<<<<<< HEAD

=======
>>>>>>> c572bc0 (primera api)
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserResponse>> getUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<UserResponse> getUser(@PathVariable UUID uuid) {
        return ResponseEntity.ok(userService.getByUuid(uuid)); // 200
    }

<<<<<<< HEAD
    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequestPost userRequest) {
        return new ResponseEntity<>(userService.createUser(userRequest), CREATED); //201 Creado
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<UserResponse> deleteUser(@PathVariable UUID uuid){
        return ResponseEntity.status(204).body(userService.deleteUser(uuid)); //204 Solicitud exitosa pero sin contenido que retornar
    }

    @PutMapping("/{uuid}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable UUID uuid, @RequestBody UserRequestPut userRequest){
        return ResponseEntity.ok(userService.updateUser(uuid, userRequest)); // Para la actualización de contenido puede retornarse un código 200 o un 400 sin retornar contenido
    }

}
=======
        @PostMapping
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequestPost userRequest) {
        return new ResponseEntity<>(userService.createUser(userRequest), CREATED); // 201 Creado
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<UserResponse> deleteUser(@PathVariable UUID uuid) {
        return ResponseEntity.status(204).body(userService.deleteUser(uuid)); // 204 Solicitud exitosa pero sin
                                                                              // contenido que retornar
    }

    @PutMapping("/{uuid}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable UUID uuid, @RequestBody UserRequestPut userRequest) {
        return ResponseEntity.ok(userService.updateUser(uuid, userRequest)); // Para la actualización de contenido puede
                                                                             // retornarse un código 200 o un 204 sin
                                                                             // retornar contenido
    }
}
>>>>>>> c572bc0 (primera api)
