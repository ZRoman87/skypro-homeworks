package course2.lesson2_part2_variant2;

public class Truck extends Vehicle implements Wheelable, Enginable, Trailerable {

    public Truck(String modelName, int wheelsCount) {
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
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void serviceVehicle() {
        super.serviceVehicle();
        checkTrailer();
    }
}
