package org.launchcode.studio7;

public abstract class BaseDisc {
    String title;
    Double length;

    public BaseDisc(String title, Double length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle(){
        return title;
    }

    public Double getLength(){
        return length;
    }
}
