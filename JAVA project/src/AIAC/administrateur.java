package AIAC;

import java.util.Date;

public class administrateur extends Personne{
	protected Ecole ecole;

 public administrateur () {
	 super();

 }
 public administrateur (String a, String b,Ecole ecole) {
		super(a,b);
		this.ecole=ecole;
		}
 /*public administrateur(String lastnamePers, String firstnamePers, String cniPers, char gender,
			Date date, String lieu) {
	 super(lastnamePers, firstnamePers,cniPers,gender,date,lieu);
	 
	 System.out.println(this.toString());
 
}*/
 public void addRespo(Respo respo, Filiere filiere) {
	 ecole.respoEcole.add(respo);
	 respo.fili�re=filiere;
 }
 
 public void inscriptionStudent() {
	 
 }
public String toString() {
	return "vous �tes " +  lastnamePers +" "+ firstnamePers ;
}
}
 
