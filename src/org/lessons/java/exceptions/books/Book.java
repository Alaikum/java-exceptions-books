package org.lessons.java.exceptions.books;

public class Book {

//	titolo, numero pagine, autore, editore
	private String titolo, autore, editore,valida="";
	private int numeroPagine;

	public Book(String titolo, String autore, String editore, int numeroPagine) throws PageException, EmptyLine {
		super();

		validatePag(numeroPagine);
		this.numeroPagine = numeroPagine;
		validateLine(titolo,"titolo");
		this.titolo = titolo;

		validateLine(autore,"autore");
		this.autore = autore;

		validateLine(editore,"editore");
		this.editore = editore;
		validaFinale();

	}

	public void validatePag(int n)  {
		if (n < 0)
			valida+=" Numero Negativo";
	}

	public void validateLine(String s,String n) {
		if (s.trim().length() < 1)
//			throw new EmptyLine(n);
			valida+=" -Campo "+n+" Vuoto";
	}
	public void validaFinale() throws EmptyLine {
		if (valida.length()>0) {
			throw new EmptyLine(valida);
		}
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws EmptyLine {
		validateLine(titolo,"titolo");
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws EmptyLine {
		validateLine(autore,"autore");
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws EmptyLine {
		validateLine(editore,"editore");
		this.editore = editore;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) throws PageException {
		validatePag(numeroPagine);

		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "Book [titolo=" + titolo + ", autore=" + autore + ", editore=" + editore + ", numeroPagine="
				+ numeroPagine + "]";
	}

}
