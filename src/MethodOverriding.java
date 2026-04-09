// Parent Class
class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }
}

// Subclass
class Engineer extends Employee {
    // Overriding the display method
    @Override
    void display() {
        // First, print the Engineer class message
        System.out.println("Name of class is Engineer");
        
        // Then, call the parent class version of display()
        super.display();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Create an object of the subclass Engineer
        Engineer eng = new Engineer();
        
        // This will trigger the logic in Engineer, which in turn calls Employee
        eng.display();
    }
}
