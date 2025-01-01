package testioe;

import java.io.IOException;

public class TestSwitchBreak {
    public static void main (String args[]){
    char firstInitial = 'a';
    System.out.println("Masukin inisial:");
    try {
    firstInitial = (char)System.in.read();
    } catch (Exception e) {
    System.out.println("Error: " + e.toString());
    }
    
    switch (firstInitial) {
    case 'a':
    System.out.println("Namamu Arjuna!");
    break;
    case 'b':
    System.out.println("Namamu Bara!");
    break;
    case 'c':
    System.out.println("Namamu Clarisa!");
    break;
    default:
    System.out.println("Aku ga kenal kamu.");
    }
    }
    
}
