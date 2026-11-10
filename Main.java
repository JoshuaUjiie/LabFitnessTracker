
import java.util.Scanner;
// Parent Class
class Workout {
    String type;
    int duration;
    void showWorkout() {
        System.out.println("Workout: " + type);
        System.out.println("Duration: " + duration + " minutes");
    }
}

// Child Class
class RunningWorkout extends Workout {
    double distance;

    void showDetails() {
        // Call parent class method
        showWorkout();
        System.out.println("Distance: " + distance + " km");
        double calories = distance * 60;
        System.out.println("Calories burned: " + calories);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RunningWorkout workout = new RunningWorkout();
        System.out.print("Enter workout type: ");
        workout.type = input.nextLine();
        System.out.print("Enter duration (minutes): ");
        workout.duration = input.nextInt();
        System.out.print("Enter distance (km): ");
        workout.distance = input.nextDouble();
        System.out.println("--- Workout Summary ---");
        workout.showDetails();
        input.close();
    }
}