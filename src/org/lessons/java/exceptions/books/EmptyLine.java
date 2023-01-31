package org.lessons.java.exceptions.books;

public class EmptyLine extends Exception {
	
	public EmptyLine(String n) {
		super("Errore: "+n.toUpperCase()+"!");
	}
}


