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

    public void novoUser(User user){
        Optional<User> virificacaoUser = dao.findByEmail(user.getEmail());

        if(virificacaoUser.isEmpty() ){
          dao.saveAndFlush(user);
       }else{
         throw   new RuntimeException("E-mail já está em uso");
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
