package generics;

public class MayBe<T> {
	private T data;
	private int status;
	// 1: darf eingesehen werden, 2: verweigert, 3: nicht angegeben
	
	public MayBe(T data, int status)
	{
		this.data = data;
		this.status = status;
	}
	
	// Ausgabe-Methode, liefert den Wert pro Case zurück
	public void print()
	{
		// Eine Abfrage, die nur int-Werte verarbeiten kann
		// Ablöse der if else Abfrage
		switch(status) 
		{
			case 1:
				System.out.println("Zugriff gestattet: " + data);
				break;
			case 2:
				System.out.println("Zugriff verweigert");
				break;
			case 3:
				System.out.println("Daten nicht erfasst");
				break;
			default:
				System.out.println("Falsche Eingabe");
				break;
		}
		
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
