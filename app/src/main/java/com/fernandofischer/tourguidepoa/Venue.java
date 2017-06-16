package com.fernandofischer.tourguidepoa;

/**
 * Created by fernandofischer on 11/06/17.
 */

public class Venue {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String title;
    private String description;
    private String telephone;
    private String mapsURI;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Venue(String title, String description, int imageResourceId) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public Venue(String title, String description, int imageResourceId, String telephone, String mapsURI) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.telephone = telephone;
        this.mapsURI = mapsURI;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMapsURI() {
        return mapsURI;
    }

    public void setMapsURI(String mapsURI) {
        this.mapsURI = mapsURI;
    }
    public boolean hasImage(){
        return (imageResourceId != NO_IMAGE_PROVIDED);
    }
}
