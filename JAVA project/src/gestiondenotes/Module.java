package gestiondenotes;
import AIAC.Class;
import AIAC.Student;

import java.util.*;
import AIAC.Class;

public class Module {
	public String nomModule;
	protected Class cl;
	protected int heureModule;
	protected Set<Element> eleModule=new HashSet<>();
	public Map<Student,Double> noteModule= new TreeMap<>();
	//public Map<Student,Integer> nbrAbsenceModule= new TreeMap<>();
	
	protected Map<Student,String> validModule= new TreeMap<>();
	protected Map<Element,Integer> heureElement= new HashMap<>();
	Scanner sc=new Scanner(System.in);
	 String Newligne=System.getProperty("line.separator");
	  
	
	public Module(String nomModule,Class cl) {
		this.nomModule=nomModule;
		this.cl=cl;
		this.cl.moduleClass.add(this);
		System.out.println("vous avez creer le module "+ nomModule);
		
		Iterator iterator = this.cl.stud.iterator();
		 while (iterator.hasNext()){
	         noteModule.put((Student)iterator.next(),0.0);
		 }
		
		
		
		this.notemodulestud();
	
		 for(Element e : eleModule) {
			 heureElement.put(e,e.totalheure);
		 }
		 
		 iterator = this.cl.stud.iterator();
		 while (iterator.hasNext()){
	         this.validModule.put((Student)iterator.next(),"");
		 }
		
		
	}
	
	public void notemodulestud() {
		double total=0d;
		int i=0;
		String valider="";
		
		for (Student s:this.cl.stud) {
			total=0;
			i=0;

			
			for (Element element: this.eleModule) {
				if (element.notefinalElement.get(s)!=-1) {
					total+=(double)element.notefinalElement.get(s);
					i++;
					if(element.notefinalElement.get(s)<6) {
						valider="NV";
						
					}
					
				}
				 double moy=(float)total/i;
				 if (valider!="NV"&&moy>=11) {
					 valider="valider";
				 }
				 else if(moy<11) {
					 valider="NV";
				 }
				 this.noteModule.put(s, moy);
			    this.validModule.put(s,valider);
			    if(s.getAnneePromo()==1) {
			    	s.setNotes(this,moy);
			    }
			    if(s.getAnneePromo()==2) {
			    	s.setNotes2(this, moy);
			    }
			    if(s.getAnneePromo()==3) {
	
			    }
			    
			    
			     valider="";
				
			}
			
		
		}
		
		
		
			 
	}
	public void affichenoteModuletud(Student s) {
		System.out.print(s.toString()+"              ");
		int a=1;
		for (int i=0;i<20-s.toString().length();i++) {
			
			System.out.print(" ");
			}
		for (Element e: this.eleModule) {
						
		           System.out.print(e.noteElement.get(s));
		           for(int i=0;i<20;i++) {
		        	   System.out.print(" ");
		           }
		        
		}
		
		System.out.println(+this.noteModule.get(s)+"               "+this.validModule.get(s));
		
	}
	public void affichenoteModuleClass() {
		System.out.print("Etudiant");                        
		for (int i=0;i<20;i++) {
			System.out.print(" ");
		}
		
		System.out.println("Module"+this.toString());
		for (int i=0;i<32;i++) {
			System.out.print(" ");
		}
		int l=0;
		
		for (Element e:this.eleModule) {
			l+=e.nomElement.length();			
			
			System.out.print(e.nomElement);
			for (int i=0;i<20-l;i++) {
				System.out.print(" ");
			}
			
		}
		for (int i=0;i<21-l;i++) {
			System.out.print(" ");
		}
		System.out.println(" Moy.             Val.");
		for (Student s: cl.stud) {
			this.affichenoteModuletud(s);
		}
	}
	
	
	public void affichEleModule() {
		System.out.println("les elements de "+ this.toString()+Newligne);
		int i=1;
		for (Element e:eleModule) {
			System.out.println(i+"-"+e.nomElement);
			i++;
		}
	}
	public void addEleModule(Element element) {
		this.eleModule.add(element);
		this.setHeureModule() ;
		
	}
	public boolean testheuresElem() {
		
		if(this.heureModule==0) {
			return true;
		}
		else return false;
	}
	public void afficheheuresModule() {
		System.out.println("le nombre total du module est : "+this.heureModule);
		
		for (Element e: this.eleModule) {
			e.afficherhours();
		}
	}
	public Element choisieElement(int a) {
		int i=1;
		 for (Element e : this.eleModule) {
			 if(i==a) {
				 return e;		
			 }
			 else i++;
		 }
		 return null;
	}
	@Override
	public String toString() {
		return "Module " + nomModule ;
	}

	public Set<Element> getEleModule() {
		return eleModule;
	}

	public void setEleModule(Set<Element> eleModule) {
		this.eleModule = eleModule;
	}
	public int getHeureModule() {
		return heureModule;
	}
	public void setHeureModule() {
		this.heureModule=0;
		 for(Element e : eleModule) {
				heureModule+=e.totalheure;
			 }
	}
	
	
	
	
}
