package AIAC;

import java.util.Date;
import java.util.Set;

public class Respo extends Personne {
	protected Filiere fili�re;
	
	public Respo () {
		super();
	}
	/*public Respo(String lastnamePers, String firstnamePers, String cniPers, char gender,
			Date date, String lieu) {
		
		super(lastnamePers, firstnamePers,cniPers,gender,date,lieu);
		
		fili�re.ecole.respoEcole.add(this);
		System.out.println("vous avez ajoutez   " +this.lastnamePers+" "+this.firstnamePers+"comme responsable" );
	
		
	}*/
	public Respo (String a, String b) {
		super(a,b);
		
	
		
		
		
	}
	
	public Filiere getFiliere() {
		return fili�re;
	}
	public boolean equals(Respo respo) {
		return (this.lastnamePers.equals(respo.lastnamePers)) && (this.firstnamePers.equals(respo.firstnamePers)) &&
		(this.fili�re.equals(respo.fili�re));
	}
	 public boolean exist(Set<Respo> list) {
			for (Respo resp: list) {
				if (resp.equals(this)) {
					break;	
				}
				else return false;
				
			}
			return true;
		}
	 public Respo choisir(int a) {
		 int i=1;
		 Respo respo= new Respo();
		 for (Respo r: fili�re.ecole.respoEcole) {
			 if (i==a) {
				 respo=r;
				 break;
			 }
			 else i++;
		 }
		 return respo;
	 }
	
	

}
