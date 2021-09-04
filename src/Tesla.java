public class Tesla extends Car {

    private float batteryCapacity;

    public Tesla(String model, float maxSpeed, float batteryCapacity, int speedsNo, int seatsNo) {
        this.batteryCapacity = batteryCapacity;
        this.model = model;
        this.fuelType = "Electric";
        this.maxSpeed = maxSpeed;
        this.seatsNo = seatsNo;
        this.speedsNo = speedsNo;
        this.airbags = true;
        this.automatic = true;
        this.dashCam = true;
        this.keyless = true;
    }

    public Tesla(String model, float maxSpeed, float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        this.model = model;
        this.fuelType = "Electric";
        this.maxSpeed = maxSpeed;
        this.seatsNo = 5;
        this.speedsNo = 1;
        this.airbags = true;
        this.automatic = true;
        this.dashCam = true;
        this.keyless = true;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String getFuel() {
        return "The car uses an " + this.fuelType + " engine with a battery capacity of " + this.batteryCapacity + "kWh";
    }
}
