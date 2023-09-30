package tnsiftask3;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", "Camry", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023, 120);

        
        System.out.println("Car Information:");
        car.displayInfo();

        System.out.println("\nMotorcycle Information:");
        motorcycle.displayInfo();
    }
}