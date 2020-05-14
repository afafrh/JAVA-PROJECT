package gestiondenotes;
import AIAC.Class;

import AIAC.Prof;
import AIAC.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Element {
	protected String duree =new String();
	protected int totalheure;
	protected int salle;
	protected String nomElement;
	protected Module module;
	protected Prof prof ;
	protected Map<Student,Double> noteElement= new TreeMap<>();
	protected Map<Student,Double> notefinalElement= new TreeMap<>();
	
	protected Map<String,Integer> repartheureElement= new HashMap<>();
	protected Map<String, Prof> enseignantElement= new HashMap<>();
	protected Map<Student,Integer> absStud=new TreeMap<>();
	Scanner sc=new Scanner(System.in);
	String Newligne=System.getProperty("line.separator");
	
//-------------------CONSTRUCTEUR--------------------------------------------------	
	public Element () {
		nomElement=" ";
	}
	public Element (String nomElement, Module module) {
		this.salle=0;
		this.totalheure=0;
		this.nomElement=nomElement;
		this.module=module;
		module.eleModule.add(this);
		Prof prof =new Prof(" "," ");
		this.duree="";
		
		System.out.println("creation " +this.toString());
		 Iterator iterator = module.cl.stud.iterator();
		 while (iterator.hasNext()){
	         noteElement.put((Student)iterator.next(),(double) -1);
		 }
		 iterator = module.cl.stud.iterator();
		 while (iterator.hasNext()){
	         notefinalElement.put((Student)iterator.next(),(double) -1);
		 }
		  for (Student s: module.cl.stud )
		  {
			  this.absStud.put(s,this.contAbsence(s));
		  }
		 
		 this.repartheureElement.put("CM",0);
		 this.repartheureElement.put("TD",0);
		 this.repartheureElement.put("TP",0);
		 this.repartheureElement.put("AP",0);
		 
		 this.enseignantElement.put(" ",prof);
		 this.enseignantElement.put(" ",prof);
		 this.enseignantElement.put(" ",prof);
		 this.enseignantElement.put(" ",prof);
		 
		 
		 
		 for (Map.Entry mapentry : repartheureElement.entrySet()) {
				System.out.println(mapentry.getKey()+"  :");
				Integer hour=sc.nextInt();
				totalheure+=hour;
				 repartheureElement.put((String)mapentry.getKey(),hour);
		 }
			
	}
	
//--------------------NOTES---------------------------------------------------------
	public int contAbsence(Student s) {
		int c=0;
		for(Absence abs: module.cl.abs) {
			if (abs.getElement().equals(this)) {
				if(abs.absStud.get(s)==true) {
					c+=1;
				}
			}
		}
		return c;
	}
	public void modnote(Student student,int note) {
		int v=0;
		for(Map.Entry mapentry : noteElement.entrySet()) {
			if(mapentry.getKey().equals(student)) {
				noteElement.put(student,(double)note);
				notefinalElement.put(student,noteElement.get(student)-(double)((0.25)*this.absStud.get(student)));
				
				v=1;
				break;
			}
			
		}
		if(v==0) {
			System.out.println("l'etudiant "+ student.toString() +" n'appartient pas � " + module.cl.toString());
		}
		this.module.notemodulestud();
		/*if (noteElement.containsKey(student)) {
		noteElement.put(student,note);
		}
		else 
			System.out.println("l'etudiant "+ student.toString() +" n'appartient pas � " + module.cl.toString());
	*/}
	
	public void affichenoteElement() {
		System.out.println("les notes de l'element " + this.nomElement+" du "+this.module);
		for (Map.Entry mapentry : noteElement.entrySet()) {
	           System.out.println(mapentry.getKey()+ "   " + mapentry.getValue());
	        }
	}
	public void affichenoteStud(Student s) {
		System.out.println(s.toString()+" "+noteElement.get(s));
	}
	
//--------------------REPARTION D'ELEMENT----------------------------------------------------
	
	public void modhours(){
		Scanner sc= new Scanner(System.in);
			
		System.out.println("Entrer les heures selon la discipline");
		for (Map.Entry mapentry : repartheureElement.entrySet()) {
			System.out.println(mapentry.getKey()+"  :");
			Integer hour=sc.nextInt();
			totalheure+=hour;
			 repartheureElement.put((String)mapentry.getKey(),hour);
		}
		
		
	}
	
	public void afficherhours() {
	
		System.out.println("la r�partition de l'element "+ this.nomElement +" :");
		for (Map.Entry mapentry : repartheureElement.entrySet()) {
			System.out.println(mapentry.getKey()+"  :  " + mapentry.getValue()+" h");
		}
		
	}
	
	public void addprof(String rep,Prof prof) {
		enseignantElement.put(rep, prof);
		System.out.println("vous avez determiner " +prof.toString()+"comme prof de l'element "+prof.getElement()+" dans le "+prof.getModule());
			
	}
	
	
	public void afficheprof() {
		System.out.println("les profs  de cet element sont : ");
		
		for (Map.Entry mapentry : enseignantElement.entrySet()) {
			System.out.println(mapentry.getKey()+"  :  " + mapentry.getValue());
		}
	}
	public void definirSalle() {
		int a=0;
		while(a==0) {
			System.out.println("entrer le num�ro de salle");
			int n=sc.nextInt();
			sc.nextLine();
			if (this.module.cl.getEcole().Salle.containsKey(n)) {
				System.out.println("Salle Occup�e");
				sc.nextLine();
				
			}
			else {
				this.module.cl.getEcole().Salle.put(n,this);
				this.salle=n;
				a=1;
			}
				
		
		}
	}
	
	
//--------------------GETTER&SETTER&toString-------------------------------------------------
	
	public String getNomElement() {
		return nomElement;
	}
	public void setNomElement(String nomElement) {
		this.nomElement = nomElement;
	}
	public Map<String, Prof> getEnseignantElement() {
		return enseignantElement;
	}
	public void setEnseignantElement(Map<String, Prof> enseignantElement) {
		this.enseignantElement = enseignantElement;
	}
	public Prof getProf() {
		return prof;
	}
	public void setProf(Prof prof) {
		this.prof = prof;
	}
	public String toString () {
		return this.nomElement;
	}
	public int getTotalheure() {
		return totalheure;
	}
	public void setTotalheure(int totalheure) {
		this.totalheure = totalheure;
	}
	public Map<Student, Integer> getAbsStud() {
		return absStud;
	}
	public void setAbsStud(Map<Student, Integer> absStud) {
		this.absStud = absStud;
	}
	public Map<Student, Double> getNoteElement() {
		return noteElement;
	}
	public void setNoteElement(Map<Student, Double> noteElement) {
		this.noteElement = noteElement;
	}
	public Map<Student, Double> getNotefinalElement() {
		return notefinalElement;
	}
	public void setNotefinalElement(Map<Student, Double> notefinalElement) {
		this.notefinalElement = notefinalElement;
	}
	

	

	
	
	
	
	

}
