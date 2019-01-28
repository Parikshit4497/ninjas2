package challenge;

public class Car {
    private String Model;
    private String engine;
    private String colour;
    private int number;
    private int wheels;

        public void setModel(String Model) {
            String validModel = Model.toLowerCase();
            if (validModel.equalsIgnoreCase("carrera") || validModel.equalsIgnoreCase("911")) {
                this.Model = Model;
            } else {
                this.Model = "Unknown";
            }
        }
        public String getModel() {
         return this.Model;
        }
}

