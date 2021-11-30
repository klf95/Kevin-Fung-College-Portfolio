public class Truck extends Vehicle {

        private int hauling;
        private int seating;
        private String vClass;
        private String t = "T";

        public int getHauling() {
                return hauling;
        }

        public void setHauling(int hauling) {
                this.hauling = hauling;
        }

        public int getSeating() {
                return seating;
        }


        public void setSeating(int seating) {
                this.seating = seating;
        }
        @Override
        public String getvClass(){
          return t;
        }
        @Override
        public void setvClass(String v){
          vClass = t.toUpperCase();
        }
        @Override
        public void stats() {

          System.out.println("Vehicle model name: " + model);
          System.out.println("Vehicle model year: " + year);
          System.out.println("Vehicle weight is: " + weight);
          System.out.println("Vehicle color is: " + color);
          System.out.println("Vehicle EPA rated MPG: " + mpg);
          System.out.println("Vehicle make name: " + make);
          System.out.println("Vehicle hauling capacity: " + hauling);
          System.out.println("Vehicle seating capacity: " + seating);
          System.out.println("Vehicle Class: " + vClass);
          System.out.println(notes);

        }

}
