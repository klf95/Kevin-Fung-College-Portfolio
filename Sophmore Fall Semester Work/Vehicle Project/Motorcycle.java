public class Motorcycle extends Vehicle {
private String mc = "MC";
        @Override
        public void setWeight(int in) {

                weight = in;

        }

        @Override
        public int getWeight() {

                return weight;

        }
        @Override
        public String getvClass(){
          return mc;
        }
        @Override
        public void setvClass(String mc) {
          vClass = mc.toUpperCase();
        }
      }
