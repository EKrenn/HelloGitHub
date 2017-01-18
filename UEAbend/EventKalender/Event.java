package EventKalender;

public class Event {
	
	private String titel;
	private String ort;
	private double eintrittspreis;
	@Override
	public String toString() {
		return "Event [titel=" + titel + ", ort=" + ort + ", eintrittspreis=" + eintrittspreis + "]";
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public void setEintrittspreis(double eintrittspreis) {
		this.eintrittspreis = eintrittspreis;
	}
	public String getTitel() {
		return titel;
	}
	public String getOrt() {
		return ort;
	}
	public double getEintrittspreis() {
		return eintrittspreis;
	}
	public Event(String titel, String ort, double eintrittspreis) {
		super();
		this.titel = titel;
		this.ort = ort;
		this.eintrittspreis = eintrittspreis;
	}
	
	

}
