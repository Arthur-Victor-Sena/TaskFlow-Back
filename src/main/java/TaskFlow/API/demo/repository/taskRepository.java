package TaskFlow.API.demo.repository;
import TaskFlow.API.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface taskRepository extends JpaRepository<Task, Long> {

List<Task> findByUserId(Long Id);

}
