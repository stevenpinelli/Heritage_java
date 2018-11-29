package com.iut.heritage;

import java.util.Scanner;



//import com.aither.data.Etudiant;

public class Personne {
	
	private String prenom;
	private String nom;
	private String profession;
	private int age;
	
	public Personne(){
		this("","","", -1);
	}
	
	public Personne(String nom, String prenom, String profession, int age){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.profession = profession;
	}
	
	public Personne(String nom, String prenom, int age){
		this(nom,prenom,"", age);
	}
	
	public Personne(String nom, String prenom){
		this(nom,prenom,"", -1);
	}
	
	public String sePresenter(){
		if(age != -1){
			return "Bonjour je m'appelle " + this.prenom + " " + this.nom.toUpperCase() + " j'ai " + this.age + " ans"; 
		}
		else{
			return "Bonjour je m'appelle " + this.prenom + " " + this.nom.toUpperCase();
		}
	}
	
	
	
	public static Personne creerPersonne(Scanner scanner){
		Personne p = new Personne();
		try{
			boolean sasieOK = false;
			while (!sasieOK) {
				System.out.print("Nom > ");
				String nom = scanner.nextLine();
				System.out.print("Prenom > ");
				String prenom = scanner.nextLine();
				System.out.print("Age? > ");
				int age = scanner.nextInt();
				System.out.print("Prefession? >");
				scanner.nextLine();
				String profession = scanner.nextLine();
				p.nom = nom;
				p.prenom = prenom;
				p.age = age;
				p.profession= profession;
				sasieOK = true;
			}
		}catch (Exception ex) {
			
		}
		return p;
	}
	
	public static Personne sasieNomPrenom(Scanner scanner){
		Personne e = new Personne();
		try{
			boolean sasieOK = false;
			while (!sasieOK) {
				System.out.print("Nom > ");
				String nom = scanner.nextLine();
				System.out.print("Prenom > ");
				String prenom = scanner.nextLine();
				e.nom = nom;
				e.prenom = prenom;
				sasieOK = true;
			}
		}catch (Exception ex) {
			
		}
		return e;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public String getPrenom(){
		return this.prenom;
	}

}
