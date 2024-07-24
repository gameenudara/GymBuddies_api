package lk.GymBuddies_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Meal_plan")
public class MealPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String MealPlanName;

    @Enumerated(EnumType.STRING)
    private MealPlanType MealPlanType;

    private String dietaryPreferences;
    private String recipes;
    private String nutritionalInformation;
    private String ingredients;
    private String portionSizes;
    private String cookingInstructions;
    private String imagePath;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    private User user;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

}
