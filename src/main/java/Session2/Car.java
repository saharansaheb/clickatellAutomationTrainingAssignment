package Session2;

public class Car {

    private String make;
    private String model;
    private String color;

    public Car()
    {
        this.make = "Ford";
        this.model = "Focus";
        this.color = "blue";
    }

    public Car(String make, String model,String color){
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getInfo(){
        return String.format("This car is a %s %s %s",color, make, model);
    }
    public void paint(String newColor){
        this.color = newColor;
    }
}
