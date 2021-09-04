public abstract class Car {

    public String model, fuelType;
    public float maxSpeed;
    public int speedsNo, seatsNo;
    public boolean airbags, automatic, keyless, dashCam;

    private static int count = 0;

    public abstract String getFuel();

    public Car() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
