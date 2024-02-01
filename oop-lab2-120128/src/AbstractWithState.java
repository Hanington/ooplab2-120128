abstract class MyVehicle {
    protected  String brand; //state of vehicle

    public MyVehicle (String brand){
        this.brand=brand;
    }

    abstract void displayType();
}

class MyCar extends MyVehicle{

    public MyCar(String brand){
        super(brand);
    }
    @Override
    void displayType() {
        System.out.println("The car is of brand: " + brand);
    }
}


abstract class ElectricVehicles {
    protected  String batteryType;

    public ElectricVehicles (String batteryType){
        this.batteryType=batteryType;
    }

    abstract void displayType();
}

class ElectricCars extends ElectricVehicles{

    public ElectricCars(String batteryType){
        super(batteryType);
    }
    @Override
    void displayType() {
        System.out.println("The Electric Car is of Battery type: " + batteryType);
    }
}

class ElectricBikes extends ElectricVehicles{

    public ElectricBikes(String batteryType){
        super(batteryType);
    }
    @Override
    void displayType() {
        System.out.println("The Electric Bike is of Battery type: " + batteryType);
    }
}

class MyMainClass {
    public static void main(String[] args) {
        MyCar car1 = new MyCar("BMW");
        car1.displayType();
        ElectricCars ecar1 = new ElectricCars("Lithium-ion");
        ecar1.displayType();
        ElectricBikes ebike1 = new ElectricBikes("Cobalt");
        ebike1.displayType();
    }
}