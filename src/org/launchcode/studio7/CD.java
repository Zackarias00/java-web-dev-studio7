package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    Integer numOfSongs;
    String artist;

    public CD (String title, Integer numOfSongs, String artist, Double length){
        super(title, length);
        this.numOfSongs = numOfSongs;
        this.artist = artist;
    }

    public Integer getNumOfSongs(){
        return numOfSongs;
    }

    public String getArtist(){
        return artist;
    }

    @Override
    public void spinDisk() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void dataSpace() {
        System.out.println("A CD has a data capacity of 700MB");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
