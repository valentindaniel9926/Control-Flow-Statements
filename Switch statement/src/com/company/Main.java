package com.company;

public class Main {

    public static void main(String[] args) {
	int value =3;
	if(value==1){
        System.out.println("Value was 1");
    }else  if(va.lue==2){
        System.out.println("Value was 2");
    }else{
        System.out.println("Was not 1 or 2");
    }
	int switchValue=1;
	switch (switchValue){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");

            case3: case4 :case 5:
            System.out.println("Was a 3, or a 4, or a 5");
            System.out.println("Actually it was a " + switchValue);
            break;

        default:
            System.out.println("Was not 1 or 2");
    }
    }
}
