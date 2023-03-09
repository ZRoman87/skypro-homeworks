package course2.lesson2_part2_variant2;

public class Car extends Vehicle implements Wheelable, Enginable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void serviceVehicle() {
        super.serviceVehicle();
        checkEngine();
    }
}
