public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public void setRentalPricePerDay(double rentalPricePerDay) {
        if (rentalPricePerDay > 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        } else {
            System.out.println("Rental price must be positive.");
        }
    }


    public boolean rent() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(make + " " + model + " has been rented.");
            return true;
        } else {
            System.out.println(make + " " + model + " is not available for rent.");
            return false;
        }
    }

    public void returnCar() {
        isAvailable = true;
        System.out.println(make + " " + model + " has been returned.");
    }

    public static void main(String[] args) {
        Car car = new Car("Rolls-Royce", "PHANTOM", 500000.0);
        System.out.println("Available: " + car.isAvailable());
        car.rent();
        System.out.println("Available: " + car.isAvailable());
        car.returnCar();
        System.out.println("Available: " + car.isAvailable());
    }
}