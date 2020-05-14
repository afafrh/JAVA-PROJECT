package AIAC;
import java.util.*;

public class Filiere implements Comparable<Filiere>{

protected String  nomFili�re;
protected Set <Promo> promoFiliere =new HashSet<>();
protected Set <Class> classFiliere= new TreeSet<>();
protected Set <Student> studFiliere= new TreeSet<>();
protected Ecole ecole;
protected Respo r= new Respo ();
	
	public Filiere() {
		
	}
	
	public Filiere(String a,Ecole ecole) {
		nomFili�re= a;
		this.ecole=ecole;
		ecole.filiereEcole.add(this);
		System.out.println("vous avez cr�er la fili�re "+this.nomFili�re);
	}
//-----------------------------------------------------------------------------
	

	public String toString() {
		return  nomFili�re ;
	}
//-------------------------------------------------------------------------------
	public void removePromoFiliere (Promo p) {
		 promoFiliere.remove(p);
	 }
	public void respoFiliere (Respo a) {
		r=a;
		System.out.println("vous avez d�terminer"+ r +"comme responsable de fili�re"+this.toString());
	}
	public void addpromoFiliere(Promo p) {
	
		promoFiliere.add(p);
	}
	public void afficheClassFiliere() {
		System.out.println("les  �tudiants de la fili�re "  + this.toString());	
		int i=1;
		 Iterator iterator = classFiliere.iterator();
		 while (iterator.hasNext()){
	         System.out.println(i+"-"+iterator.next());
	         i++;
		}
 }
	public void afficheStudFiliere() {
		 System.out.println("les  �tudiants de la fili�re "  + this.toString());	
		 Iterator iterator = studFiliere.iterator();
		 while (iterator.hasNext()){
	         System.out.println(iterator.next());
		 }
		}
	public void affichePromoFiliere() {
		System.out.println("le Promotions de la filiere "+ this.toString() );
		int i=1;
		Iterator iterator = promoFiliere.iterator();
		while(iterator.hasNext()) {
			System.out.println(i+"-"+iterator.next());
			i++;
		}
		
	}
	public Class choisir(int classchoisie) {
		Class cl = new Class ();
		 int i=1;
			for (Class c:this.classFiliere ) {
				if (i==classchoisie) {
					cl=c;
					break;
				}
				else i++;
			}
		return cl;
	}
	
	public int compareTo(Filiere f) {
		
		 return this.nomFili�re.compareTo(f.nomFili�re) ;
	}
	public boolean equals(Filiere f) {
		return this.nomFili�re.equals(f.nomFili�re);
	}

	
	
	
	
	

}
