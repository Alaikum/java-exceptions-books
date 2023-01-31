package org.lessons.java.exceptions.books;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numLib, numeroPagine;
		String titolo = "we", autore, editore;
		Scanner s = new Scanner(System.in);

		System.out.print("Quanti libri vuoi inserire? ");
		numLib = Integer.parseInt(s.nextLine());
		Book[] b = new Book[numLib];
		

		for (int i = 0; i < b.length; i++) {
//			titolo, numero pagine, autore, editore
			System.out.print("Inserisci il titolo del libro? ");
			titolo = s.nextLine();
			System.out.print("Inserisci il numero di pagine? ");
			numeroPagine = Integer.parseInt(s.nextLine());

			System.out.print("Inserisci l'autore del libro? ");
			autore = s.nextLine();
			System.out.print("Inserisci l'editore del libro? ");
			editore = s.nextLine();

			try {
				b[i] = new Book(titolo, autore, editore, numeroPagine);
			} catch (PageException e) {
				System.out.println("Il formato del numero di pagine non è valido: " + e.getMessage());
				return;
			} catch (EmptyLine e) {
				System.out.println("Attenzione: " + e.getMessage());
				return;
			}

		}

		s.close();

	}

}
