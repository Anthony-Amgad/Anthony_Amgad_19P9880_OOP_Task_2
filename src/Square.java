public class Square implements Shape{
    private boolean isFilled;
    private double side;
    private String color;

    public Square(double side) {
        try {
            if (side >= 0){
                this.side = side;
                this.isFilled = false;
                this.color = "Black";
            }
            else
                throw new Exception("Invalid side entered... Square side set to 0");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Square(double side, boolean isFilled, String color) {
        try {
            if (side >= 0){
                this.side = side;
                this.isFilled = isFilled;
                this.color = color;
            }
            else
                throw new Exception("Invalid side entered... Square side set to 0");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double getArea(){
        return this.side * this.side;
    }

    @Override
    public String getShapeName(){
        return "Square";
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        try {
            if (side >= 0)
                this.side = side;
            else
                throw new Exception("Invalid side entered... Side not changed");
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
