/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void Short() {
		System.out.println(" \"||||*|||*|||*|||*|||*|||-----------------------------------");
		System.out.println(" \"||*|||*|||*|||*|||*|||*|===================================");
	}

	public static void Stripes() {
		System.out.println(" \"-----------------------------------------------------------");
		System.out.println(" \"===========================================================");
	}
	public static void Pole_human() {
		System.out.println(" \"  |");
	}
	public static void pole() {
		System.out.println(" \"");
	}
	public static void main (String [] args) {
		System.out.println(" ^||*|||*|||*|||*|||*|||*|===================================");
Short();
Short();
Short();
Short();
Stripes();
Stripes();
pole();
pole();
System.out.println(" \"       _[ What an honor to be holding THE US flag!]");
System.out.println(" \"(^ ^)_/");
Pole_human();
System.out.println(" \" \\|");
System.out.println(" \"  |\\");
Pole_human();
Pole_human();
System.out.println(" \" / \\");
System.out.println("My boy Bobert holding up the US flag to celebrate the 4th of July");
	}
}