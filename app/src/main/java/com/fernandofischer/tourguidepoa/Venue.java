package com.fernandofischer.tourguidepoa;

/**
 * Created by fernandofischer on 11/06/17.
 */

public class Venue {
    private String title;
    private String description;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Venue(String title, String description, int imageResourceId) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
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

    public boolean hasImage(){
        return (imageResourceId != NO_IMAGE_PROVIDED);
    }
}
