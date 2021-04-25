package com.company;

public class Main {

    public static void main(String[] args) {
	char letter = 'D';
	switch (letter){
        case 'A':
            System.out.println("The letter is A");
        break;
        case 'B':
            System.out.println("The  letter is B");
            break;
        case 'C': case 'D': case 'E':
            System.out.println(letter + " was found");break;
        default:
            System.out.println("No letter found");
            break;

    }
    }
}
