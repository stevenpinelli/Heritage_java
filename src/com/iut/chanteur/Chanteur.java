package com.iut.chanteur;

import java.util.Scanner;

import com.iut.heritage.Personne;

public class Chanteur extends Personne {
	
	private String maisonEdition;
	
	public Chanteur(String prenom, String nom, int age){
		super(prenom,nom,"chanteur",age);
	}
	
	public static Personne creerChanteur(Scanner scanner){
		Chanteur c = null;
		try{
			boolean sasieOK = false;
			while (!sasieOK) {
				System.out.print("Nom > ");
				String nom = scanner.nextLine();
				System.out.print("Prenom > ");
				String prenom = scanner.nextLine();
				System.out.print("Age? > ");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Maison d'edition > ");
				String maisonEdition = scanner.nextLine();
				c = new Chanteur(nom,prenom,age);
				sasieOK = true;
			}
		}catch (Exception ex) {
			
		}
		return c;
	}
	
	public String sePresenter(){
		return super.sePresenter() + " et je suis chanteur";
	}
	
	public void setEdition(String nom){
		
	}
	
	public void getEdition(String nom){
		
	}

}
