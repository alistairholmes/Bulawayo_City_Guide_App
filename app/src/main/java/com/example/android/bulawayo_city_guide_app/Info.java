package com.example.android.bulawayo_city_guide_app;

import android.util.Log;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 *  {@link Info} Is a custom object that contains information about attractions in a city.
 *  Information includes a Title, a Description translation, an Image for that attraction,
 *  Address, Operating Hours and a Star Rating.
 */

public class Info {

    // Title name for the attraction
    private String mTitle;

    // Description for the attraction
    private String mDescription;

    // ImageResource ID for attraction
    private int mImageResourceID;

    // Location of attraction
    private String mAddress;

    // Operating Hours of attraction
    private String mOperatingHours;

    // Star Rating of attraction
    private double mStarRating;

    /**
     * Create a new Info object.
     *
     * @param title is the name of the attraction.
     * @param description is the description of the attraction
     *
     * @param address location of attraction
     * @param operatingHours operating hours of attraction
     * @param starRating rating of attraction
     */
    public Info (String title, String description, String address, String operatingHours, double starRating) {
        mTitle = title;
        mDescription = description;
       /* mImageResourceID = imageResourceID;*/
        mAddress = address;
        mOperatingHours = operatingHours;
        mStarRating = starRating;
    }

    // Get the title of attraction.
    public String getTitle() {
        return mTitle;
    }

    // Get description of attraction
    public String getDescription() {
        return mDescription;
    }

    // Return imageResource
    public int getImageResourceID() {
        return mImageResourceID;
    }

    // Get address of attraction
    public String getAddress() {
        return mAddress;
    }

    // Get operating hours
    public String getOperatingHours() {
        return mOperatingHours;
    }

    // Get star rating
    public double getStarRating() {
        return mStarRating;
    }

    //Creates String using Info ArrayList.
    @Override
    public String toString() {
        String displayInfo = "Title: " + getTitle() + "\n" +
                             "Description: " + getDescription() + "\n" +
                             "Address: " + getAddress() + "\n" +
                             "Hours: " + getOperatingHours() + "\n" +
                             "Star Rating: " + getStarRating() + "\n";
        return displayInfo;

    }
}
