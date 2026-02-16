package TaskFlow.API.demo.controller;
import TaskFlow.API.demo.entity.User;
import TaskFlow.API.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> listagem(){
    return    userService.listagem();
    }

    @PostMapping
    public ResponseEntity<Void> novoUser(@RequestBody User user){

        try{
            userService.novoUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch (RuntimeException e ){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<User> listagemId(@PathVariable Long id){

    return userService.listagemId(id).map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());

    }

    @PutMapping("/{id}")
    public ResponseEntity<User> atualizarId(@PathVariable Long id, @RequestBody User user){

        try{
            userService.atualizarId(id , user);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }


    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> apagarporId(@PathVariable Long id ){

     try{
         userService.apagarpoId(id);
         return ResponseEntity.noContent().build();
     }catch (RuntimeException e){
         return ResponseEntity.notFound().build();
     }

    }

}
