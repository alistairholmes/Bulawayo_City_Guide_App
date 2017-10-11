package com.example.android.bulawayo_city_guide_app;

import android.util.Log;

import static android.R.attr.description;
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
    private String mStarRating;

    /**
     * Create a new Info object.
     *
     * @param title is the name of the attraction.
     * @param description is the description of the attraction
     * @param image is image of attraction
     * @param address location of attraction
     * @param operatingHours operating hours of attraction
     * @param starRating rating of attraction
     */
    public Info (String title, String starRating, int image, String description, String address, String operatingHours) {
        mTitle = title;
        mDescription = description;
        mImageResourceID = image;
        mAddress = address;
        mOperatingHours = operatingHours;
        mStarRating = starRating;
    }

    // Get the title of attraction.
    public String getTitle() {
        return mTitle;
    }

    // Get star rating
    public String getStarRating() {
        return mStarRating;
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



}
