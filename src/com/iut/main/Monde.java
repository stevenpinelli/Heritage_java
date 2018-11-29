package com.iut.main;

import java.util.Scanner;

import com.iut.chanteur.Chanteur;

import com.iut.heritage.Personne;

public class Monde {
	
/*	public static final String CHOIX_AJOUTER = "1";
	public static final String CHOIX_RECHERCHER = "2";
	public static final String CHOIX_QUITTER = "3";*/


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*Personne p1 = Personne.creerPersonne(sc);
		Personne p2 = Personne.creerPersonne(sc);*/
		Personne c	= Chanteur.creerChanteur(sc);
		
		System.out.println(c.sePresenter());
	//	System.out.println(p2.sePresenter());
		System.out.println(c.getEdition());
		
	}
		
		
		
		/*ArrayList<Personne> personnes = new ArrayList<Personne>();
		int indexSaisie = 0;
		Scanner sc = new Scanner(System.in);
		String saisie = "";
		while (!saisie.equalsIgnoreCase("Q")) {
			afficherMenu();
			saisie = sc.nextLine();
			switch (saisie) {
			case CHOIX_AJOUTER:
				if(indexSaisie < 2){
					personnes.add(Personne.creerPersonne(sc));
					indexSaisie ++;
				} else{
					System.out.println("Désolé mais c'est plein ..");
				}
				break;
			case CHOIX_RECHERCHER:
				Personne personneRechercherSuper = Personne.sasieNomPrenom(sc);
				Personne trouver = rechercherPersonne(personnes, personneRechercherSuper);
				if(trouver != null){
					System.out.println(trouver.sePresenter());
				}
				break;
			case CHOIX_QUITTER:
				break;
			default:
				System.err.println("Erreur de saisie ...");
				break;
			}
		}
	}
	
	public static Personne rechercherPersonne(ArrayList<Personne> personnes, Personne p){
		for (Personne personne : personnes) {
			if(p.getNom().equalsIgnoreCase(personne.getNom()) && p.getPrenom().equalsIgnoreCase(personne.getPrenom())) return personne;
		}
		return null;
	}
			
		public static void afficherMenu() {
				System.out.println("************************");
				System.out.println(CHOIX_AJOUTER + "- Ajouter une Personne");
				System.out.println(CHOIX_RECHERCHER + "- Rechercher une Personne");
				System.out.println(CHOIX_QUITTER + "- Quitter");
				System.out.println("************************");
			}*/

}
