package com.example.android.newsapp;


public class News {

    // Date and Time of the news
    private String mDateAndTime;

    // Author of the news
    private String mAuthor;

    // Title of the news
    private String mTitle;

    // URL of the news
    private String mUrl;

    /*
    * Create a new News object.
    *
    * @param dateAndTime is the date and time of the news
    * @param title is the title of the news
    * @param url is the URL of the news
    * */
    public News(String dateAndTime, String author, String title, String url) {
        mDateAndTime = dateAndTime;
        mAuthor = author;
        mTitle = title;
        mUrl = url;
    }

    /**
     * Get the date and time of the news
     */
    public String getDateAndTime() {
        return mDateAndTime;
    }

    /**
     * Get the author of the news
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Get the title of the news
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the URL if the news
     */
    public String getUrl() {
        return mUrl;
    }

}
