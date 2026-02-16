package TaskFlow.API.demo.repository;
import TaskFlow.API.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskRepository extends JpaRepository<Task, Long> {
}
