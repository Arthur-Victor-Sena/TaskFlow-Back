package TaskFlow.API.demo.repository;

import TaskFlow.API.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface repository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
