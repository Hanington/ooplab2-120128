abstract class Vehicle{
    abstract void startEngine();
}

interface SelfDriving {
    void navigate();
}

class Bus extends Vehicle implements SelfDriving {

    @Override
    void startEngine() {
        System.out.println("The Bus engine has started");
    }

    @Override
    public void navigate() {
        System.out.println("The bus is navigating autonomously");
    }
}



class  MainClass {
    public static void main(String[] args) {
        System.out.println("What is the status of the bus?");
        Bus bus1 = new Bus();
        bus1.startEngine();
        bus1.navigate();
    }
}