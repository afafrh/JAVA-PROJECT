package AIAC;
import gestiondenotes.Module;
import gestiondenotes.Absence;
import gestiondenotes.EDT;
import gestiondenotes.Element;
import java.util.*;
import java.text.*;
import java.time.LocalDateTime;
import java.text.*;

public class project {
	public static void main(String[] args) throws ParseException {
		Scanner sc= new Scanner(System.in);
	/*	
		System.out.println("**************************BIENVENUE DANS LE SYSTEM****************************" );
		
		System.out.println("enter le nom de l'�cole");
		String nomEcole=sc.nextLine();
		System.out.println("enter l'abreveation de l'�cole");
		String abrEcole=sc.nextLine();
		System.out.println("enter le fondateur de l'�cole");
		String fondateur=sc.nextLine();
		System.out.println("enter le type de l'�cole");
		String type=sc.nextLine();
		System.out.println("enter l'adresse de l'�cole");
		String adressEcole=sc.nextLine();
		
		Ecole ecole=new Ecole(nomEcole, abrEcole,fondateur,type,adressEcole);
		System.out.println("**************************BIENVENUE DANS LE SYSTEM "+ecole.abrEcole+"****************************" );
	 	System.out.println(ecole.toString());*/
		Ecole ecole= new Ecole();
		Filiere fo= new Filiere ("GI",ecole);
		Promo po=new Promo(fo,16);
		Class co= new Class(fo,po);
		Respo respm= new Respo("","");
	
		administrateur admin=new administrateur("l","e",ecole);
		admin.addRespo(respm, fo);
		
		
	 	String Newligne=System.getProperty("line.separator");
		int id= 0;
	 /*	
	 	 while (id==0) {
	 		System.out.println("vous �tes:"+Newligne+Newligne+"1-Administrateur"+Newligne+"2-Responsable de fili�re"+Newligne+"3-Enseignant"+Newligne+"4-Etudiant"+Newligne+"5-Visiteur");
		 	id=sc.nextInt();
		 	sc.nextLine();
		 	System.out.println(Newligne);
			System.out.println("Entrez votre Nom ");
			String nom =sc.nextLine();
			System.out.println("Entrez votre et Pr�nom");
			String prenom =sc.nextLine();
			
	
	//************************** ADMINISTRATEUR ****************************************		
			if(id==1) {
				System.out.println("Entrez le mot de passe");
				String pwd=sc.nextLine();
				if (pwd.equals("admin")) {
					administrateur pers= new administrateur(nom,prenom,ecole);	
					System.out.println("vous �tes connect� en tant qu'administrateur");
					System.out.println(Newligne);
					int ad1=0;
					while (ad1==0) {
						System.out.println("Choisir votre prochaine action:"+Newligne+Newligne+"1-G�stion des �tudes"+Newligne+"2-G�stion de scolarit�"+Newligne+"3-Les statistiques et rapports "+Newligne+"4-Retour"+Newligne);
						ad1=sc.nextInt();
						sc.nextLine();
						if (ad1==1) {//gestion des etudes 
							int ad2=0;
							while (ad2==0) {
								System.out.println("Choisir votre prochaine action:"+Newligne+Newligne+"1-Cr�er une fili�re"+Newligne+"2-Cr�er une classe"+Newligne+"3-ajout d'un responsable de fili�re "+Newligne+"4-Retour");
								 ad2= sc.nextInt();
								 sc.nextLine();
								if (ad2==1) {
									System.out.println("Veuillez saisir le nom de la nouvelle fili�re");
									String nomFiliere=sc.nextLine();
									Filiere filiere = new Filiere(nomFiliere,ecole);
									ad2=0;
									
									}
		*/							
		/*						if (ad2==2) {
									System.out.println("Veuillez Saisir la fili�re dans laquel vous voulez ajouter la promotion");
									ecole.affichefiliereEcole();
									int filierechoisie=sc.nextInt();
									/*sc.nextLine();
									int i=1;
									Filiere filiere=ecole.choisirFiliere(filierechoisie);*/
			/*						
									System.out.println("Veuillez saisir l'ann�e de la promotion");
									int ann�e=sc.nextInt();
									sc.nextLine();
									Promo promotion=new Promo(ecole.choisirFiliere(filierechoisie),ann�e);
									Class c=new Class(ecole.choisirFiliere(filierechoisie),promotion);
									ad2=0;
												
								}
								if (ad2==3) {
									System.out.println("Veuillez saisir le nom ");
									String nomRespo=sc.nextLine();
									System.out.println("Veuillez saisir le pr�nom");
									String prenomRespo=sc.nextLine();
									System.out.println("Affectez le responsable � une fili�re:");
									ecole.affichefiliereEcole();
									int filierechoisie=sc.nextInt();
									sc.nextLine();
									Filiere filiere=ecole.choisirFiliere(filierechoisie);
									Respo responsable=new Respo(nomRespo,prenomRespo);	
									pers.addRespo(responsable,filiere);
									ad2=0;
								 }
					*/			 
									/*	if (ad2==4)
								{
									System.out.println("Veuillez choisir la fili�re");
									ecole.affichefiliereEcole();
									int filierechoisie=sc.nextInt();
									sc.nextLine();
									int i=1;
									Filiere filiere = new Filiere();
									for(Filiere f: ecole.filiereEcole) {
										if(i==filierechoisie) {
											filiere=f;
											break;
										}
										else i++;
										}
									System.out.println("Veuillez choisir la promotion disponible pour la filiere");
									filiere.affichePromoFiliere();
									int promochoisie=sc.nextInt();
									sc.nextLine();
									Promo promotion = new Promo();
									i=1;
									for(Promo promo: filiere.promoFiliere) {
										if(i==promochoisie) {
											promotion=promo;
											break;
										}
										else i++;
										}
									Class c=new Class(filiere,promotion);
									ad2=0;
								}*/
									
	/*							if(ad2==4) {
									ad1=0;
								}
									
									
							}
								
							}
	/*						
						
					 if (ad1==2) {//gestion de scolarit�
						int ad2=0;
						while( ad2==0) {
						System.out.println("Choisir votre prochaine action:"+Newligne+"1-Validation des Inscriptions"+Newligne+"2-Correction et modification des inscriptions"+Newligne+"5-Retour");
						ad2=sc.nextInt();
						sc.nextLine();
						if(ad2==1) {//validation des inscriptions
							
						}
						
						if(ad2==2) {
							//correction
						}
						if (ad2==5) {//retour
							ad1=0;
						}
																	
					}
					}
					if(ad1==3) {//les statistiq
						while (ad1==0){
						System.out.println("Choisir votre prochaine action:"+Newligne+Newligne+"1-Statistiques et rapport sur les �tudes"+Newligne+"2-Statistiques et rapport sur la scolarit�"+Newligne+"3-Statistiques et rapport sur les exams "+Newligne+"4-Retour"+Newligne);
						ad1=sc.nextInt();
						sc.nextLine();
						if (ad1==1){//etude
						int ad2=0;
						while(ad2==0){
							System.out.println("Choisir votre prochaine action:"+Newligne+Newligne+"1-Afficher les fili�res de l'�cole"+Newligne+"2-Afficher les classes d'une fili�re"+Newligne+"3-Afficher les heures des modules pour chaque filli�re"+Newligne+"4-Afficher les emploies du temps "+Newligne+"5-Retour"+Newligne);
							ad2=sc.nextInt();
							sc.nextLine();
							if(ad2==1){//filiere d'ecole
									ecole.affichefiliereEcole();
									ad2=0;
							}
								
							if (ad2==2){//classes de filiere
								System.out.println("choisir la fili�re:");
								ecole.affichefiliereEcole();
								int filierechoisie=sc.nextInt();
								int i =1;
								for (Filiere f:ecole.filiereEcole) {
									if(i==filierechoisie) {
										f.afficheClassFiliere();
										ad2=0;
										break;
									}
									else i++;
								}
							}
							if (ad2==3){//heures module
								System.out.println("choisir la fili�re:");
								ecole.affichefiliereEcole();
								int filierechoisie=sc.nextInt();
								int i =1;
								for (Filiere f:ecole.filiereEcole) {
									if(i==filierechoisie) {
										System.out.println("choisir la classe");
										f.afficheClassFiliere();
										int clchoisie=sc.nextInt();
										i=1;
										for (Class c:f.classFiliere) {
											if (i==clchoisie) {
												c.afficherheursModuleClass();
												ad2=0;
												break;
												
											}
											else i++;
										}
										break;
										
									}
									else i++;
								}
							}
							
								
							if (ad2==4){//afficher les emploies
								System.out.println("choisir la fili�re:");
								ecole.affichefiliereEcole();
								int filierechoisie=sc.nextInt();
								int i =1;
								for (Filiere f:ecole.filiereEcole) {
									if(i==filierechoisie) {
										System.out.println("choisir la classe");
										f.afficheClassFiliere();
										int clchoisie=sc.nextInt();
										i=1;
										for (Class c:f.classFiliere) {
											if (i==clchoisie) {
												c.afficheEdtClass();
												ad2=0;
												break;
												
											}
											else i++;
										}
										break;
										
									}
									else i++;
								}
							}
						
							if (ad2==5){//retour
								ad1=0;
							}
						}
							
						
					}
					
						
					
						
						if (ad1==2){//scolarit�
						ad1=3;
						}
						
						if (ad1==3){//examen
						ad1=3;
						}
						
						if (ad1==4){//retour
						  ad1=0;
						}
						
					if(ad1==4) {//retour
						id=0;
						}
					
					}
				}
				
										
			
				else {
					System.out.println("le mot de passe  incorrecte");
					id=0;
				}
			
					}
				}
			}
			
			
	//****************************	RESPONSABLE DE FILIERE **************************	
			
			 if(id==2){
				System.out.println("Veuillez saisir votre fili�re");
				ecole.affichefiliereEcole();
				int filierechoisie=sc.nextInt();
				sc.nextLine();
				Filiere filiere=ecole.choisirFiliere(filierechoisie);
				Respo respo= new Respo(nom,prenom);
				respo.fili�re=filiere;				
				
				if(respo.exist(ecole.respoEcole)) {
					System.out.println("Entrez le mot de passe");
					String pwd=sc.nextLine();
					if (pwd.equals("")) {	
						int r=0;
						while (r==0) {
							System.out.println("Choisir votre prochaine action:"+Newligne+Newligne+"1-G�stion des �tudes"+Newligne+"2-G�stion de scolarit�"+Newligne+"3-Gestion des exams "+Newligne+"4-Retour"+Newligne);
							r=sc.nextInt();
							sc.nextLine();
							if (r==1) {//gestion des etudes
								int r1=0;
								while (r1==0) {
									System.out.println("Choisir votre prochaine action:"+Newligne+Newligne+"1-Ajout des modules pour une classe"+Newligne+"2-ajout d'element"+Newligne+"3-Retirer un module"+Newligne+"4-Retirer un �l�ment"+Newligne+"5-Determination des enseignants"+Newligne+"6-Gestion d'emploi"+Newligne+"7-Afficher les donn�es de la fili�re"+Newligne+"8-Retour");
									r1=sc.nextInt();
									sc.nextLine();
									if (r1==1) {//ajout de module
										System.out.println("choisir la classe");
										filiere.afficheClassFiliere();
										int classechoisie=sc.nextInt();
										sc.nextLine();
										Class cl= filiere.choisir(classechoisie);
										System.out.println("entrer le nom du nouveau module :"+Newligne);
										String nomModule=sc.nextLine();
										Module module=new Module(nomModule,cl);
										
										while (r1==1) {
											System.out.println("1-ajoutez un element"+Newligne+"2-retour");
											r1=sc.nextInt();
											sc.nextLine();
											if(r1==2) {
												r1=0;
												break;
											}
											else
											{
												System.out.println("entrer le nom du nouveau element");
												String nomElement=sc.nextLine();
												Element element =new Element(nomElement,module);
												module.setHeureModule();
												System.out.println("total"+element.getTotalheure()+" "+module.getHeureModule() );
											
												element.definirSalle();
												//element.modhours();
												r1=1;
											}
										}
									}
									
									if (r1==2) {//ajout d'element
										System.out.println("choisir la classe");
										filiere.afficheClassFiliere();
										int classechoisie=sc.nextInt();
										sc.nextLine();
										Class cl= filiere.choisir(classechoisie);
										int r2=2;
										while (r2==2) {
											System.out.println("choisir le module");
											cl.affichermoduleClass();
											int modulechoisi=sc.nextInt();
											sc.nextLine();
											
											r2=1;
											while(r2==1) {
												System.out.println("entrer le nom de l'element");
												String nomElement=sc.nextLine();
												cl.addElement(modulechoisi,nomElement);
												
												System.out.println("1-ajouter un element"+Newligne+"2-changer le module"+Newligne+"3-changer la classe"+Newligne+"4-retour"+Newligne);
												r2=sc.nextInt();
												sc.nextLine();
												if(r2==3) {
													r2=0;																							
												}
												if(r2==4) {
													r1=0;
												}
											}
										
										}
										
									}
									if (r1==3) {//remove module
										System.out.println("choisir la classe");
										filiere.afficheClassFiliere();
										int classechoisie=sc.nextInt();
										sc.nextLine();
										Class cl= filiere.choisir(classechoisie);
										System.out.println("choisir le module");
										cl.affichermoduleClass();
										int modulechoisi=sc.nextInt();
										sc.nextLine();
										cl.removeModule(modulechoisi);
										r1=0;
									}
									if(r1==4) {//remove element
										System.out.println("choisir la classe");
										filiere.afficheClassFiliere();
										int classechoisie=sc.nextInt();
										sc.nextLine();
										Class cl= filiere.choisir(classechoisie);
										System.out.println("choisir le module");
										cl.affichermoduleClass();
										int modulechoisi=sc.nextInt();
										sc.nextLine();
										cl.removeElement(modulechoisi);
										r1=0;
									}
									if (r1==5) {//prof
										System.out.println("entrer le nom d'enseignant");
										String nomProf=sc.nextLine();
										System.out.println("entrer le pr�nom d'enseignant");
										String prenomProf=sc.nextLine();
										Prof prof=new Prof(nomProf,prenomProf);
										System.out.println("choisir la classe");
										filiere.afficheClassFiliere();
										int classechoisie=sc.nextInt();
										sc.nextLine();
										Class cl= filiere.choisir(classechoisie);
										
										cl.addprof(prof);
										r1=0;
										
										
									}
									
									if (r1==6) {//gestion d'emploi
										System.out.println("choisir la classe");
										filiere.afficheClassFiliere();
										int classechoisie=sc.nextInt();
										sc.nextLine();
										Class cl= filiere.choisir(classechoisie);
										
										SimpleDateFormat s= new SimpleDateFormat("dd MM yyyy");
										int r2=0;
										while(r2==0) {
											System.out.println("choisir votre prochaine action "+Newligne+"1-creer un nouveau EDT"+Newligne+"2-modifier un edt");
											r2=sc.nextInt();
											sc.nextLine();
											
											if (r2==1) {
												
												if (cl.testheurModule()==false) {
													int lund=1;
													while(lund==1) {
														System.out.println("veuillez entrer la date de d�but de l'emploi sous forme 'dd mm yyyy' ");
														String date=sc.nextLine();
														
														if(s.parse(date).getDay()==1) {
															cl.addEDT( date);
															r1=0;
															lund=0;
															break;
														}
														else {
															System.out.println("veullez saisir la date du debut de la semaine");
														}
													}
												}
												
											
												else {
													System.out.println("veuillez entrer la date de d�but de l'emploi sous forme 'dd mm yyyy' ");
													String date=sc.nextLine();
													cl.examEDT( date);
													r1=0;
												}
													
										}
											else if (r2==2) {//modifier l'edt
												
												cl.modEdt();
												
											}
											
										r1=0;
											}
											
									}
										
									
									
									if(r1==7) {//afficherles donnees
									int r2=0;
									while(r2==0) {
										System.out.println("choisir votre prochaine action:"+Newligne+"1-afficher les classes de la fili�re"+filiere.nomFili�re+Newligne+"2-afficher les �tudiants de la fili�re"+filiere.nomFili�re+Newligne+"3-afficher les profs de la fili�re"+filiere.nomFili�re+Newligne+"4-afficher les emploies d'une classe"+filiere.nomFili�re+Newligne+"5-afficher les modules d'une classes"+filiere.nomFili�re+Newligne+"6-afficher les element d'un module"+filiere.nomFili�re+Newligne+"7-Retour"+Newligne);										
										r2=sc.nextInt();
										sc.nextLine();
										if (r2==1) {//classe
											
											filiere.afficheClassFiliere();
											r2=0;
										}
										if(r2==2) {//etudiant
											System.out.println("choisir la classe");
											filiere.afficheClassFiliere();
											int classechoisie=sc.nextInt();
											sc.nextLine();
											Class cl= filiere.choisir(classechoisie);
											cl.affichestudClass();
											r2=0;
										}
										if (r2==3) {//afficher les profs
											System.out.println("choisir la classe");
											filiere.afficheClassFiliere();
											int classechoisie=sc.nextInt();
											sc.nextLine();
											Class cl= filiere.choisir(classechoisie);
											
											cl.afficherProf();
											r2=0;
											
										}
										if(r2==4) {//les emploi
											System.out.println("choisir la classe");
											filiere.afficheClassFiliere();
											int classechoisie=sc.nextInt();
											sc.nextLine();
											Class cl= filiere.choisir(classechoisie);
											cl.afficheEdtClass();
											r2=0;
										}
										if (r2==5) {//module
											System.out.println("choisir la classe");
											filiere.afficheClassFiliere();
											int classechoisie=sc.nextInt();
											sc.nextLine();
											Class cl= filiere.choisir(classechoisie);
											cl.affichermoduleClass();
											r2=0;
										}
										if(r2==6) {//element 
											System.out.println("choisir la classe");
											filiere.afficheClassFiliere();
											int classechoisie=sc.nextInt();
											sc.nextLine();
											Class cl= filiere.choisir(classechoisie);
											cl.afficherElementClass();
											r2=0;
											
										}
										if (r2==7) {
											r1=0	;
										}
									}
									
									}
									if(r1==8){//retour
										r=0;
									}
									
									
									
									
								}
							}
								
						    
									
							
							if(r==2) {//gestion de scolarit�
								int r1=0;
								while(r1==0) {
									System.out.println("choisir votre prochaine action:"+Newligne+"1-Gestion des abscences"+Newligne+"2-Gestion des notes"+Newligne);
									r1=sc.nextInt();
									if(r1==1) {//gestion des abscence
										while(r1==2) {
											System.out.println("choisir votre prochaine action:"+Newligne+"1-Entrer les notes"+"2-Modifier les notes"+"3-Afficher les notes"+Newligne);
											r1=sc.nextInt();
											if(r1==1) {
												//entrer les absences 
											}
											if(r1==2) {
												//modifier les abscences
											}
											if(r1==3) {
												//afficher les abscences
											}
										}
									}
									if(r1==2) {//gestion des notes
										while(r1==2) {
											System.out.println("choisir votre prochaine action:"+Newligne+"1-Entrer les notes"+"2-Modifier les notes"+"3-Afficher les notes"+Newligne);
											r1=sc.nextInt();
											if(r1==1) {
												//entrer les notes 
											}
											if(r1==2) {
												//modifier les notes
											}
											if(r1==3) {
												//afficher les notes
											}
										}
									}
									if(r1==3) {//retour
										r=0;
									}
								}
								
							}
							if(r==3) {//gestion des exams
								
								
							}	
							if(r==4) {//retour
								id=0;
							}
							
						}
					}
					
					//Motdepass incorecte
					else {
						System.out.println("le mot de passe  incorrecte");
						id=0;
					}
				
				
					
			 }
				else {
					System.out.println("vous n'�tes pas un responsable dans cette ecole");
					id=0;
					}
				
	 	 
	 	 }
	
				
				
	//*************************** ENSEIGNANT*****************************************
				
			else if(id==3) {
				System.out.println("Entrez le mot de passe");
				String pwd=sc.nextLine();
				if (pwd=="profAIAC") {
					Personne pers= new Prof(nom,prenom);
				}
				else id=0;
			}
		//*************************** ETUDIANT *************************************
			
			else if(id==4) {
				
				System.out.println("Entrez le mot de passe");
				String pwd=sc.nextLine();
				if (pwd=="profAIAC") {
					Personne pers= new Student(nom,prenom);
				}
				else id=0;
			}
	//************************************ VISITEUR ***********************************
			else if (id==5) {
				Personne pers=new Visiteur(nom,prenom);
			}
			}
	 	 }
}
	
*/
	
	 	 
	 	
		
	 
		
		Filiere f1= new Filiere("GI",ecole);
		Filiere f2=new Filiere("GEET",ecole);
		Filiere f3 = new Filiere ("ICNA",ecole);
		Filiere f4=new Filiere ("IESCA",ecole);
		
		Promo p2= new Promo(15);
		Promo p1=new Promo(16);
		
		Class c= new Class(f1,p1);
		
		Student S1=new Student ("Rhif","afaf");
		Student S2=new Student ("LAHBIL","MOHAMMED");
		Student S3=new Student ("ZIAD","RASSMI");
		Student S4=new Student ("LAAROUSSI","HAMZA");
		Student S5=new Student ("APAA","BOUIHI");
		Student S6=new Student ("BElEhOU","JIHANE");
		Student S7=new Student ("LAHLOU","HAMZA");
		Student S8=new Student ("ABADI","aCHRAF");
		Student S9=new Student ("BANI","HACHIM");
		Student S10=new Student("Slalmi","IBTISSAM");
		
		c.addStud(S1);
		c.addStud(S2);
		c.addStud(S5);
		c.addStud(S7);
		c.addStud(S8);
		c.addStud(S4);
		c.addStud(S9);
		c.addStud(S6);
		c.addStud(S3);
		c.addStud(S10);
		
		
		
	
		Module m= new Module("Programmation",c);
		
		Element elem=new Element ("java",m);
		Prof prof = new Prof ("lolo"); 
		Element em=new Element("er",m);
		//Element e=new Element ("java++",m);
		
		//elem.modnote(S1, 20);
		//elem.affichenoteStud(S1);
		//e.modnote(S1, 3);
		//m.affichenoteModuletud(S1);
		//m.notemodulestud();
		//m.affichenoteModuleClass();
		//System.out.println(m.noteModule);
		//EDT edt= new EDT("20 10 1999");
		System.out.println(elem.getAbsStud());
		System.out.println(c.abs);
		/*1c.affichermoduleClass();
		int modulechoisi=sc.nextInt();
		c.choisirModule(modulechoisi).affichEleModule();
		int elementchoisi=sc.nextInt();
		c.affichestudClass();
		int studchoisi=sc.nextInt();
		c.addAbsence("09 05 2020", studchoisi, modulechoisi, elementchoisi);
		System.out.println(elem.getAbsStud());*/
		Absence abs=new Absence(elem, "09 05 2020");
		Absence a=new Absence(elem, "10 05 2020");
		Absence aM=new Absence(em, "10 05 2020");
		abs.addAbsence(S1);
		a.addAbsence(S1);
		aM.addAbsence(S1);
		c.addnoteStud();
		System.out.println(elem.getNoteElement());
		System.out.println(elem.getNotefinalElement());
		abs.justifieAbs(S1);
		System.out.println(elem.getNoteElement());
		System.out.println(elem.getNotefinalElement());
		c.addnoteStud();
		c.addnoteStud();
		System.out.println(elem.getNoteElement());
		System.out.println(elem.getNotefinalElement());
		System.out.println(elem.getNoteElement());
		System.out.println(em.getNotefinalElement());
		System.out.println(em.getAbsStud());
		m.affichenoteModuleClass();
		/*abs.addAbsence(S1);
		m.affichenoteModuletud(S1);
		
		a.addAbsence(S1);
		m.affichenoteModuletud(S1);
		abs.justifieAbs(S1);
		m.affichenoteModuletud(S1);
		c.addnoteStud();
		
		
		m.affichenoteModuletud(S1);
		/*
		Absence aM=new Absence(em, "10 05 2020");
		aM.addAbsence(S1);
		System.out.println(c.abs);
		
		c.addnoteStud();
		m.notemodulestud();
		
		System.out.println(m.noteModule);
		m.affichenoteModuletud(S1);
		abs.justifieAbs(S1);
		System.out.println(elem.getAbsStud());
		System.out.println(elem.noteElement);*/
	}}	
		
		
		
	 	 
	
	
	



		
		
		

