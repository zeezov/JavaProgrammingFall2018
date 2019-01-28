package day43_Static_Constractors02;

public class TV_01 {
	
	private int channel = 1; // 1 - 120 channels
	private int volumeLevel = 1; // 1 - 7 max volume
	private boolean on = false;
	private String brand = "undefined";
	
	
	public TV_01() {
		System.out.println("Creating TV object using no Args - constructor");
	}
	
	public TV_01(String brand) {
		System.out.println("Creating TV Object using 1 arg - constructor");
		this.brand = brand;
	}
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		
		if(on && channel > 0 && channel <= 120) {
		
		this.channel = channel;
	
		} else {
			System.out.println("Error: TV is either OFF invlaid channel");
		}
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		
		if(on == true && volumeLevel >= 1 && volumeLevel <= 7 ) {
		
		this.volumeLevel = volumeLevel;
		
		} else {
			System.out.println("Error: TV is either OFF invlaid volume level");
		}
	}
	public boolean isOn() {
		return on;
	}
	
	public void turnOn() {
		if(isOn()) {
			System.out.println("TV is already ON");
		} else {
			on = true;
			//or this.on = true;
		}
	}
	public void turnOff() {
		if(isOn()) {
			on = false;
		} else {
			System.out.println("TV is already OFF");
		}
	}
	
	public void channelUP() {
		if(isOn() && channel < 120) {
			channel++;
		}
	}
	public void channelDown() {
		if(isOn() && channel > 1) {
			channel--;
		}
	}
	public void volumeUp() {
		if(isOn() && volumeLevel < 7) {
			volumeLevel++;
		}
	}
	public void volumeDown() {
		if(isOn() && volumeLevel > 1) {
			volumeLevel--;
		}
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

}
