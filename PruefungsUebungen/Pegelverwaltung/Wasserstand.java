package Pegelverwaltung;

import java.util.*;

public class Wasserstand {
	public int id;
	public String gewaesserName; 
	public double messWert;
	public double messWertFuerAlarmierung;
	public int time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGewaesserName() {
		return gewaesserName;
	}
	public void setGewaesserName(String gewaesserName) {
		this.gewaesserName = gewaesserName;
	}
	public double getMessWert() {
		return messWert;
	}
	public void setMessWert(double messWert) {
		this.messWert = messWert;
	}
	public double getMessWertFuerAlarmierung() {
		return messWertFuerAlarmierung;
	}
	public void setMessWertFuerAlarmierung(double messWertFuerAlarmierung) {
		this.messWertFuerAlarmierung = messWertFuerAlarmierung;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public Wasserstand(int id, String gewaesserName, double messWert, double messWertFuerAlarmierung, int time) {
		super();
		this.id = id;
		this.gewaesserName = gewaesserName;
		this.messWert = messWert;
		this.messWertFuerAlarmierung = messWertFuerAlarmierung;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Wasserstand [id=" + id + ", gewaesserName=" + gewaesserName + ", messWert=" + messWert
				+ ", messWertFuerAlarmierung=" + messWertFuerAlarmierung + ", time=" + time + "]";
	}
	
	
}
