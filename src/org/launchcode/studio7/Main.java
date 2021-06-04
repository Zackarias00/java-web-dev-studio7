package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("music time",12,"larry lou",70.36);
        DVD myDVD = new DVD("movie time", 120.0,"larry loo",true);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisk();
        myDVD.spinDisk();
        myCD.dataSpace();
        myDVD.dataSpace();
        System.out.println(myCD.getTitle());
        System.out.println(myDVD.getTitle());
    }
}
