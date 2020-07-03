package adrianromanski.pluralsight.bryan_hansen.structural.facade.car.car_system;

public class FuelInjector {

    private FuelPump fuelPump = new FuelPump();

    public void on(){

        System.out.println("Fuel injector ready to inject fuel.");
    }

    public void inject() {
        fuelPump.pump();
        System.out.println("Fuel injected.");
    }

    public void off() {
        System.out.println("Stopping Fuel injector..");

    }
}
