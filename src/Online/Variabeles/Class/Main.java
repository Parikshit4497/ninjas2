package Online.Variabeles.Class;

public class Main {
    public static void main(String[] args) {
        Car porche =new Car();
        Car holden =new Car();
        System.out.println("The model of the car is:" + porche.getModel());
          porche.setModel("Carrera");
        System.out.println("The model of the car is:" + porche.getModel());
    }
}
