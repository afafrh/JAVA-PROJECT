package lolo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test {

	public static void main(String[] args) throws EXC,IllegalArgumentException, IOException {
		
		/*File f=new File("C:/Users/pc/Desktop/test1.txt");
		BufferedReader br=null;
		Set <Integer > s=new HashSet<>();
		for(int i=0;i<5;i++) {
			s.add(i);
		}
		try(BufferedWriter bw= new BufferedWriter(new FileWriter(f))) {
		FileReader fr= new FileReader(f);
		br= new BufferedReader(fr);
		String z;
		for (int a: s) {
			z=a+"";
			bw.write(z);
		}
		
		z=br.readLine();
		System.out.println(z);
		
		//System.out.println(h.substring(18, 21));
		}
		
			
	
		catch(FileNotFoundException e) {
			System.out.println("impossible");
		}
		catch(IOException e) {
			e.printStackTrace(); 
		}
		try {
			br.close();
		} catch(IOException e) {
			System.out.println("impossible");
		}
		catch(NullPointerException e) {
			System.out.println("morida");
		}*/
		m a= new m();
		a.lire();
		
		a.ecrire();
		a.lire();
		
		
	}

}
