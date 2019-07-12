package com.stackroute.hackthon;

public class Printer {

    private int noOfPagesPrinted;
    private boolean duplexPrinter;
    private float tonerLevel;

    public Printer(int noOfPagesPrinted, boolean duplexPrinter, float tonerLevel) {

        this.noOfPagesPrinted = noOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
        this.tonerLevel = tonerLevel;
    }

    public void setNoOfPagesPrinted(int noOfPagesPrinted) {
        this.noOfPagesPrinted = noOfPagesPrinted;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }

    public void setTonerLevel(float tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public float getTonerLevel() {
        return tonerLevel;
    }

    public void fillTonerLevel()
    {
        System.out.println("fill Toner Level Entered");
        setTonerLevel(100);
    }

    public void printingPages()
    {
        System.out.println("Priniting a new page");

        if(this.duplexPrinter)
        {
            setNoOfPagesPrinted(this.noOfPagesPrinted + 1);
        }
        else {

            setNoOfPagesPrinted(this.noOfPagesPrinted+2);
        }

        setTonerLevel(this.tonerLevel-5);

        if(tonerLevel == 0)
        {
            fillTonerLevel();
        }
    }

}
