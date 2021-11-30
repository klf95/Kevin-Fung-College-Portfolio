import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class Fleet{

	public static void main(String[] args) throws Exception{
		ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner (System.in);
		System.out.println("input db text file");
			String db = input.next();
			Scanner DBread = new Scanner(new FileInputStream(new File(db)));

			while(DBread.hasNext())	{
				String type = DBread.next();
				if (type.equals("A")) {
					Car mycar = new Car();
					mycar.setMake(DBread.next());
					mycar.setModel(DBread.next());
					mycar.setWeight(DBread.nextInt());
					mycar.setColor(DBread.next());
					mycar.setYear(DBread.nextInt());
					mycar.setMPG(DBread.nextDouble());
					mycar.setSeating(DBread.nextInt());
					cars.add(mycar);

				}
				if (type.equals("T")) {
					Truck mytruck = new Truck();
					mytruck.setModel(DBread.next());
					mytruck.setMake(DBread.next());
					mytruck.setWeight(DBread.nextInt());
					mytruck.setColor(DBread.next());
					mytruck.setYear(DBread.nextInt());
					mytruck.setMPG(DBread.nextDouble());
					mytruck.setSeating(DBread.nextInt());
					mytruck.setHauling(DBread.nextInt());
					cars.add(mytruck);

				}
				if (type.equals("MC")) {
					Motorcycle mymotorcycle = new Motorcycle();
					mymotorcycle.setModel(DBread.next());
					mymotorcycle.setMake(DBread.next());
					mymotorcycle.setWeight(DBread.nextInt());
					mymotorcycle.setColor(DBread.next());
					mymotorcycle.setYear(DBread.nextInt());
					mymotorcycle.setMPG(DBread.nextDouble());
					cars.add(mymotorcycle);


			}

			}

			System.out.println("What vehicle class would you like to list? (A: Automobile, T: Truck, MC: Motorcycle)");

String search = keyboard.next().toUpperCase();
int count = 0;
for (Vehicle car : cars)
{
   if(car.getvClass().equals(search)) {
       car.stats();
       count++;
   }

}
System.out.println(count + " vehicles of the " + search + " class have been found and returned by your search");

keyboard.close();
input.close();
        }


}



		// You can see how 2 constructors work to do the same thing but in 2 different ways
