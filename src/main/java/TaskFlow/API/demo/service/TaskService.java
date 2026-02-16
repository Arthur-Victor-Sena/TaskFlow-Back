package TaskFlow.API.demo.service;

import TaskFlow.API.demo.entity.User;
import TaskFlow.API.demo.repository.repository;
import TaskFlow.API.demo.entity.Task;
import TaskFlow.API.demo.repository.taskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    taskRepository dao;
    UserService userService;


    public TaskService(UserService userService, taskRepository dao) {
        this.userService = userService;
        this.dao = dao;
    }

    public void criarTarefa(Task task){

        try {

            Optional<User> verifica = userService.listagemId(task.getId_user());

            if(verifica.isEmpty()){
                throw new NullPointerException("Usuário não foi encontrado");
            }else {
                dao.save(task);
            }
        } catch (Exception e) {
            throw new RuntimeException("ERRO AO SALVAR");
        }
    }


    public List<Task> listagemAll(){

       return dao.findAll();

    }

}
