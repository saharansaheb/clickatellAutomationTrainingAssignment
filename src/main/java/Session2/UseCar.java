package Session2;

public class UseCar {


    public static void main(String[] args){


        Car[] carPark = new Car[3];

        carPark[0] = new Car("First", "Pinto" ,"red");
        carPark[1] = new Car ("Ford", "Focus","blue");
        carPark[2] = new Car ("Maserati","Gibli","blue");

        for(Car car:carPark)
        {
            System.out.println(car.getInfo());
        }

        for(int count=0; count<carPark.length; count++){
            System.out.println(carPark[count].getInfo());
        }
}
}
