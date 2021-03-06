/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.bookworm;

//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import java.util.List;
//
//import static android.R.attr.format;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link BookAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Book} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the adapter
     */
    public BookAdapter(Context context, List<Book> earthquakes) {
        super(context, 0, earthquakes);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Book currentBook = getItem(position);

//        // Find the TextView with view ID magnitude
//        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
//        // Display the magnitude of the current earthquake in that TextView
//        String formattedMagnitude = formatMagnitude(currentBook.getMagnitude());
//        // Display the magnitude of the current earthquake in that TextView
//        magnitudeView.setText(formattedMagnitude);

//        magnitudeView.setText(currentBook.getMagnitude());

        //Find ImageView with ID image
//        ImageView image = (ImageView) listItemView.findViewById(R.id.image) ;
//        image.setImageURI(currentBook.getThumbnailUrl());

        // Find the TextView with view ID location
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display the location of the current earthquake in that TextView
        titleView.setText(currentBook.getTitle());

//         Date dateObject = new Date(currentBook.getTimeInMilliseconds());
//
        // Find the TextView with view ID date
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText((currentBook.getAuthor()));

//        String formattedDate = formatDate(dateObject);
//        // Display the date of the current earthquake in that TextView
//        authorView.setText(formattedDate);
//        // Find the TextView with view ID time
//        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
//        // Format the time string (i.e. "4:30PM")
//        String formattedTime = formatTime(dateObject);
//        // Display the time of the current earthquake in that TextView
//        timeView.setText(formattedTime);


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    /**
     * Return the formatted magnitude string showing 1 decimal place (i.e. "3.2")
     * from a decimal magnitude value.
     */
    private String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}