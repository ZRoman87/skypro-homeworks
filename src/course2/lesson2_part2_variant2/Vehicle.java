package course2.lesson2_part2_variant2;

public abstract class Vehicle implements Wheelable {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void serviceVehicle() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
