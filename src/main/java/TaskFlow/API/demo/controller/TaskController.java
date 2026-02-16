package TaskFlow.API.demo.controller;

import TaskFlow.API.demo.entity.Task;
import TaskFlow.API.demo.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/task")
public class TaskController {
TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    ResponseEntity<Void> criarTarefa(@RequestBody Task task){
        try{
           taskService.criarTarefa(task);
          return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (RuntimeException e) {
          return   ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping()
    public List<Task> listagemAll(){

        return    taskService.listagemAll();

    }
}
