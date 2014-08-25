package FacadePattern.FaceadeClasses;

public class Oven {

	private int temperature;
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int temperature){
		this.temperature=temperature;
		System.out.println("temp of oven is set to ---"+this.temperature);
	}
	public void onOven(){
		System.out.println("oven is on");
	}
	public void offOven(){
		System.out.println("Turning off the oven");
	}
}
