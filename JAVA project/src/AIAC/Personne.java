package AIAC;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Personne {
	protected String lastnamePers;
	protected String firstnamePers;
	
	protected String cniPers;
	protected char gender;
	protected Date date = new Date();
	protected String lieu;
	

	
	public Personne() {
		lastnamePers="";
		firstnamePers="";
		}
	public Personne(String a, String b) {
		lastnamePers=a;
		firstnamePers=b;
		}
	
	public Personne(String lastnamePers, String firstnamePers, String cniPers, char gender,
			String date, String lieu) throws ParseException {
		SimpleDateFormat s= new SimpleDateFormat("dd MM yyyy");
		this.lastnamePers = lastnamePers;
		this.firstnamePers = firstnamePers;
		this.gender = gender;
		this.date =s.parse(date);
		this.lieu = lieu;
		this.cniPers = cniPers;
	}
	
	
	
	public String toString() {
		return   lastnamePers + " "+ firstnamePers ;
	}
	
	
	

}
