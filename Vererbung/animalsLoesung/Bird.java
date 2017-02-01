package animalsLoesung;

public class Bird 
extends Animal 
{

public Bird(String name, String color, int countEyes) {
super(name, color, countEyes);
}

public void walk() {
System.out.println("step by step");
}

public void makeNoise() {
System.out.println("piep piep");
}



}