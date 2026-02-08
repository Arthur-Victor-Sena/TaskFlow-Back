package TaskFlow.API.demo.service;

import TaskFlow.API.demo.entity.User;
import TaskFlow.API.demo.repository.repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    repository dao;


    public UserService(repository repository) {
        this.dao = repository;
    }



    public List<User> listagem(){
        return   dao.findAll();
    }

    public ResponseEntity<String> novoUser(User user){

        User newUser = dao.saveAndFlush(user);

        if(newUser.getId() == null){
         return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }else {
           return ResponseEntity.status(HttpStatus.CREATED).build();
        }

    }

    public Optional<User> listagemId(Long id){


        return dao.findById(id);
    }


    public User atualizarId(Long id , User user){

        User userBanco = dao.findById(id)
                        .orElseThrow(() -> new RuntimeException("Usuário não encontrado my friend"));

        userBanco.setNome(user.getNome());
        userBanco.setEmail(user.getEmail());
        userBanco.setSenha(user.getSenha());

       return dao.save(userBanco);
    }


    public void apagarpoId(Long id){

        User userBanco = dao.findById(id)
                .orElseThrow(() -> new RuntimeException(""));

        dao.deleteById(id);


    }


}
