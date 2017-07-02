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

/**
 * An {@link Book} object contains information related to a single earthquake.
 */
public class Book {

    /** Magnitude of the earthquake */
//    private double mMagnitude;

    /** Location of the earthquake */
    private String mTitle;

    private String mAuthor;

    /** Time of the earthquake */
//    private long mTimeInMilliseconds;

    /** Url of the earthquake */
    private String mUrl;



    /**
     * Constructs a new {@link Book} object.
     *
//     * @param magnitude is the magnitude (size) of the earthquake
//     * @param title is the city title of the earthquake
//     * @param timeInMilliseconds is the date the earthquake happened
     */
    public Book (String title, String author, String url) {
//        mMagnitude = magnitude;
        mTitle = title;
//        mTimeInMilliseconds = timeInMilliseconds;
        mAuthor = author;
        mUrl = url;

    }

    /**
     * Returns the magnitude of the earthquake.
     */
//    public double getMagnitude() {
//        return mMagnitude;
//    }

    /**
     * Returns the location of the earthquake.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the time of the earthquake.
     */
//    public long getTimeInMilliseconds() {
//        return mTimeInMilliseconds;
//    }
//
    /** Returns the url String */
    public String getUrl() {
        return mUrl;
    }

    public String getAuthor() {
        return mAuthor;
    }

}