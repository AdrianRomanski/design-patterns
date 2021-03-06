package adrianromanski.pluralsight.bryan_hansen.structural.facade.car.car_system;

public class Radiator {

    public void on(){
        System.out.println("Radiator switched on!");
    }

    public void off(){
        System.out.println("Radiator switched off!");
    }

    public void setSpeed(Integer speed){
        System.out.println("Setting radiator speed to " + speed);
   }
}
