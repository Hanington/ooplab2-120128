//An interface with constant field
interface ElectricVehicle {
        int MAX_CHARGE_TIME = 8; // This is a constant, not an instance variable
        void charge();
}


//Interface implementation and utilization of constant
class ElectricCar implements ElectricVehicle {
    protected int currentChargeTime;
    @Override
    public void charge() {
        currentChargeTime = MAX_CHARGE_TIME; // Using the interface constant
        System.out.println("Charging for " + currentChargeTime + " hours.");
    }
}

class InterfaceWithStateMain {
    public static void main(String[] args) {
        //Create an object of class ElectricCar
        ElectricCar electricCar = new ElectricCar();
        electricCar.charge();
    }
}