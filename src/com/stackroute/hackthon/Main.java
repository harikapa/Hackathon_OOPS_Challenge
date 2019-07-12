package com.stackroute.hackthon;

public class Main {
    public static void main(String[] args) {

        Printer printer=new Printer(0,true,100);

        for (int i=0;i<100;i++)
        {
            printer.printingPages();

            System.out.println("No.Of Pages Printed :"+printer.getNoOfPagesPrinted());

            System.out.println("Tonner level :"+printer.getTonerLevel());
        }
    }
}
