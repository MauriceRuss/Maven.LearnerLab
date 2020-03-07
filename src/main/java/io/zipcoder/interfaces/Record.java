package io.zipcoder.interfaces;

public class Record {

    String artist;
    String color;
    int releaseId;
    boolean isPlaying;

    Record(String artist, int releaseId){
        this.artist= artist;
        this.releaseId= releaseId;
    }

    public String getArtist() {

        return artist;
    }

    public void setArtist(String artist) {

        this.artist = artist;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(int releaseId) {
        this.releaseId = releaseId;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {

        isPlaying = playing;
    }

    public static void main(String[] args){
        Record record1 = new Record("TheWho", 1);
        System.out.println("here is the initial record: " + record1.getArtist());
        record1.setArtist("KittyRotten");
        System.out.println("here is the new value of record1: " + record1.getArtist());
    }
}
