package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news
 * in the data source (a list of {@link News} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context    of the app
     * @param listOfNews is the list of listOfNews, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> listOfNews) {
        super(context, 0, listOfNews);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID date_and_time
        TextView dateAndTimeView = (TextView) listItemView.findViewById(R.id.date_and_time);
        // Find the date and time for current news
        String dateAndTime = currentNews.getDateAndTime();
        // Display the date and time of the current news in that TextView
        dateAndTimeView.setText(dateAndTime);

        // Find the TextView with view ID author
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        // Find the author for current news
        String author = currentNews.getAuthor();
        // Display the author of the current news in that TextView
        authorView.setText(author);

        // Find the TextView with view ID location
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Get the title from the News object,
        String title = currentNews.getTitle();
        // Display the title of the current news in that TextView
        titleView.setText(title);

        // Return the list item view that is now showing news
        return listItemView;
    }

}