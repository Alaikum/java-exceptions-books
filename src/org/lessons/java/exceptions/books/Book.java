package org.lessons.java.exceptions.books;

public class Book {

//	titolo, numero pagine, autore, editore
	private String titolo, autore, editore;
	private int numeroPagine;

	public Book(String titolo, String autore, String editore, int numeroPagine) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;
		this.numeroPagine = numeroPagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	
	

}
