package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    String director;
    boolean bonusContent;

    public DVD(String title, Double length, String director, boolean bonusContent){
        super(title, length);
        this.director = director;
        this.bonusContent = bonusContent;
    }

    public String getDirector(){
        return director;
    }

    public boolean getBonusContent(){
        return bonusContent;
    }

    @Override
    public void spinDisk() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void dataSpace() {
        System.out.println("A DVD has a data capacity of 4.7 GB");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
