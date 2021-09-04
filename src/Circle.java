public class Circle implements Shape{
    private boolean isFilled;
    private double radius;
    private String color;

    public Circle(double radius) {
        try {
            if (radius >= 0){
                this.radius = radius;
                this.isFilled = false;
                this.color = "Black";
            }
            else
                throw new Exception("Invalid radius entered... Circle radius set to 0");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Circle(double radius, boolean isFilled, String color) {
        try {
            if (radius >= 0){
                this.radius = radius;
                this.isFilled = isFilled;
                this.color = color;
            }
            else
                throw new Exception("Invalid radius entered... Circle radius set to 0");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String getShapeName(){
        return "Circle";
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        try {
            if (radius >= 0)
                this.radius = radius;
            else
                throw new Exception("Invalid radius entered... Radius not changed");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
