package com.company;

public class Main {

    public static void main(String[] args) {
    String month = "NOVEMBER";
    switch (month.toLowerCase()){
        case "january":
            System.out.println("January");
            break;
        case "February":
            System.out.println("February");
            break;
        case "March":
            System.out.println("March");
            break;
        case "April":
            System.out.println("April");
            break;
        case "May": case "June": case "July": case "August": case "September": case "October" :case "november": case "December":
            System.out.println(month + " was found");
            break;
        default:
            System.out.println("There is no month");
    }
    }
}
