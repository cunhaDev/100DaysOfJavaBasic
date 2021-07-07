package com.mateus.ahundredOfJavaBasic.day001;

/**
 * do you know how Java is compiled behind the IDE?
 * @author Mateus Cunha - Junior Java Developer
 */

public class HowToExecuteProgramJava {
	public static void main(String[] args) {
		System.out.println("Hey, Day 001 of Java Basic!");
	}
}

/**
 * You create a class inside an IDE,
 * which in turn comes with the " .java " extension which the JVM (virtual machine) cannot compile on.
 * example: you create Class Person by IDE, example: you create Class Person by IDE,
 * then Java generates a person.java file.
 */

/**
 * That's when the Java Development Kit(JDK) works its magic!
 * Through the Javac that comes inside the JDK as an executable file it transforms
 * Person.java into Person.class in the internal bytecode format.
 * This way the JVM can compile and run what you defined in your code.
 */

/**
 * When you click on Run As Java Application,
 * behind everything you are doing this command: java Person, thus executing your Java program!
 */

//Finish