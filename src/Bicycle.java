
public class Bicycle {

	private int gear;
	private String color;
	private boolean running = false;
	
	public Bicycle(int gear, String color) {
		this.gear = gear;
		this.color = color;
	}

	public int getGear() {
		return gear;
	}

	public String getColor() {
		return color;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//our methods
	public void RunStart() {
		this.running = true;
	}
	
	public void RunStop() {
		this.running = false;
	}
	
	public void isRunning() {
		if(this.running) {
			System.out.println(" === The bike is running!");
		}else {
			System.out.println(" === The bike is idle!");
		}
	}
	
	
	//ATTENDANCE TIME: 8:15 - 8:17AM ONLY
	
}
