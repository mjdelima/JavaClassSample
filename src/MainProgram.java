
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle bike1 = new Bicycle(4, "Black");
		
		bike1.setColor("Red");
		bike1.setGear(3);
		System.out.println("Number of gears is: " + bike1.getGear());
		System.out.println("Color is: " + bike1.getColor());
		
		bike1.isRunning();
		bike1.RunStart();
		
		bike1.isRunning();
		bike1.RunStop();
		
		bike1.isRunning();
		
		

	}

}
