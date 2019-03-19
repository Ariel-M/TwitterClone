package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class Tweet {
    public String body;
    public long uid;
    public String createdAt;
    public User user;

    public Tweet(){
    }

    public static Tweet fromJson(JSONObject jsonObject) throws JSONException {
        Tweet tweet = new Tweet();
        tweet.body = jsonObject.getString("text");
        tweet.createdAt = jsonObject.getString("created_at");
        tweet.uid = jsonObject.getLong("id");
        tweet.user = User.fromJson(jsonObject.getJSONObject("user"));

        return tweet;
    }
}