// A default method in an interface
interface MyElectricVehicle {
    //This is the default method for the interface
    default void charge() {
        System.out.println("Charge the vehicle.");
    }
    /*This is an abstract method, which implementing
    classes must override*/
    void discharge();
}

//Implementing class for the interface
class MyElectricCar implements MyElectricVehicle {
    //Overriding the abstract method
    @Override
    public void discharge() {
        System.out.println("Driving the vehicle.");
    }
    //Note that the default method does not need overriding
}

class DefaultMethodInterfaceMain {
    public static void main(String[] args) {
        MyElectricCar electricCar = new MyElectricCar();
        System.out.println("What to do when I get home with my Tesla?");
        electricCar.charge();
        System.out.println("**********************************************");
        System.out.println("What does it take for the Tesla to discharge?");
        /*This method invocation means the default method of the interface
        is readily available to its implementing classes*/
        electricCar.discharge();
    }
}