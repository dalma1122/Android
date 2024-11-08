package com.example.hf7;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String mName;
    private int mThumbnailDrawable;
    private String mText;

    public Contact(String mName, int mThumbnailDrawable, String mText) {
        this.mName = mName;
        this.mThumbnailDrawable = mThumbnailDrawable;
        this.mText = mText;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmThumbnailDrawable() {
        return mThumbnailDrawable;
    }

    public void setmThumbnailDrawable(int mThumbnailDrawable) {
        this.mThumbnailDrawable = mThumbnailDrawable;
    }

    public String getmText() {
        return mText;
    }

    public void setmNumber(String mNumber) {
        this.mText = mNumber;
    }

    public static List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Octopus", R.drawable.cat, "8 tentacled monster"));
        contacts.add(new Contact("Pig", R.drawable.disznyo, "Delicious in rolls"));
        contacts.add(new Contact("Sheep", R.drawable.dog, "Great for jumpers"));
        contacts.add(new Contact("Rabbit", R.drawable.giraffe, "Nice in a stew"));
        contacts.add(new Contact("Snake",R.drawable.horse, "Great for shoes"));
        contacts.add(new Contact("Spider", R.drawable.lion, "Scary"));
        contacts.add(new Contact("Spider", R.drawable.octopus3, "Scary"));
        contacts.add(new Contact("Spider", R.drawable.rabbit, "Scary"));
        contacts.add(new Contact("Spider",R.drawable.sheep, "Scary"));
        return contacts;
    }
}
