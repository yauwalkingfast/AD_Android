package com.example.androidprototype.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.util.Date;

public class Recipe {

    //@SerializedName("recipeId")
    //private int id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("dateCreated")
    private Date dateCreated;

    @SerializedName("durationInMins")
    @Expose
    private int durationInMins;

    @SerializedName("calories")
    @Expose
    private int calories;

    @SerializedName("user")
    @Expose
    private User user;

    @SerializedName("comments")
    @Expose
    private CommentList comment;

    @SerializedName("likesDislikes")
    @Expose
    private LikesDislikesList likesDislikes;


    public Recipe() {
        super();
    }

    public Recipe(String title, String description, Date dateCreated, int durationInMins, int calories) {
        this.title = title;
        this.description = description;
        this.dateCreated = dateCreated;
        this.durationInMins = durationInMins;
        this.calories = calories;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getDurationInMins() {
        return durationInMins;
    }

    public void setDurationInMins(int durationInMins) {
        this.durationInMins = durationInMins;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CommentList getComment() {
        return comment;
    }

    public void setComment(CommentList comment) {
        this.comment = comment;
    }

    public LikesDislikesList getLikesDislikes() {
        return likesDislikes;
    }

    public void setLikesDislikes(LikesDislikesList likesDislikes) {
        this.likesDislikes = likesDislikes;
    }
}
