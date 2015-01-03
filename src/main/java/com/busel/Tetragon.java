package com.busel;

public abstract class Tetragon {
    final static int angleCount = 4;
    private String colour = "black";
    private int lengthA;
    private int lengthB;
    private int lengthC;
    private int lengthD;

    public Tetragon(int lengthA, int lengthB, int lengthC, int lengthD) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.lengthD = lengthD;
    }

    public Tetragon(int lengthA, int lengthB, int lengthC, int lengthD, String colour) {

        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.lengthD = lengthD;
        this.colour = colour;
    }
    public static int getPerimeter(Tetragon figure){
        return figure.getLengthA()+figure.getLengthB()+figure.getLengthC()+figure.getLengthD();
    }
    public static void whoIAm(Tetragon figure){
        System.out.println("I am " + figure.getColour() + " " + figure.getClass().getName());
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLengthA() {
        return lengthA;
    }

    public void setLengthA(int lengthA) {
        this.lengthA = lengthA;
    }

    public int getLengthB() {
        return lengthB;
    }

    public void setLengthB(int lengthB) {
        this.lengthB = lengthB;
    }

    public int getLengthC() {
        return lengthC;
    }

    public void setLengthC(int lengthC) {
        this.lengthC = lengthC;
    }

    public int getLengthD() {
        return lengthD;
    }

    public void setLengthD(int lengthD) {
        this.lengthD = lengthD;
    }

    public void printInfo(){
        System.out.println("Tetragon is " + getColour()+ ", side a: " + getLengthA() + "side b: " + getLengthB()+
                "side c: " + getLengthC()+ "side d: " + getLengthD());
    }
}
