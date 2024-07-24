package lk.GymBuddies_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fName;

    private String lName;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String mediaUrl;

    @OneToMany(mappedBy = "user")
    private List<Comment> comment = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Post> post = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<MealPlan> mealPlan = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<WorkoutPlan> workoutPlan = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<WorkoutStatus>workoutStatuse = new ArrayList<>();
}
