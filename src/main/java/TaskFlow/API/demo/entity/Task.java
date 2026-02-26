package TaskFlow.API.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Table (name = "tasks")
@Entity
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;

    private String titulo;
    private String descr ;

    @Enumerated(EnumType.STRING)
    private StatusTarefa status;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;



    public enum StatusTarefa {
        pending,
        in_progress,
        done
    }
}
