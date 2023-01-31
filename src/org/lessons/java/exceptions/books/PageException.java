package org.lessons.java.exceptions.books;

public class PageException extends Exception {

	public PageException() {
		super("Il numero delle pagine non può essere negativo!!!");
	}
}
