package org.lessons.java.exceptions.books;

public class Book {

//	titolo, numero pagine, autore, editore
	private String titolo, autore, editore;
	private int numeroPagine;

	public Book(String titolo, String autore, String editore, int numeroPagine) throws PageException, EmptyLine {
		super();

		validateLine(titolo);
		this.titolo = titolo;

		validateLine(autore);
		this.autore = autore;

		validateLine(editore);
		this.editore = editore;

		validatePag(numeroPagine);
		this.numeroPagine = numeroPagine;
	}

	public void validatePag(int n) throws PageException {
		if (n < 0)
			throw new PageException();
	}

	public void validateLine(String s) throws EmptyLine {
		if (s.trim().length() < 1)
			throw new EmptyLine();
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws EmptyLine {
		validateLine(titolo);
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws EmptyLine {
		validateLine(autore);
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws EmptyLine {
		validateLine(editore);
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
