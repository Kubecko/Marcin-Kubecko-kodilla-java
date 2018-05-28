package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistic {
    Statistics statistics;

    public CalculateStatistic(Statistics statistics) {
        this.statistics = statistics;
    }

    private int numberUsers;
    private int numberPosts;
    private int numberComment;
    private double avgPostOfUser;
    private double avgCommentOfUser;
    private double avgCommentOfPosts;

    public int getNumberUsers() {
        return numberUsers;
    }

    public int getNumberPosts() {
        return numberPosts;
    }

    public int getNumberComment() {
        return numberComment;
    }

    double getAvgPostOfUser() {
        return avgPostOfUser;
    }

    double getAvgCommentOfUser() {
        return avgCommentOfUser;
    }

    double getAvgCommentOfPosts() {
        return avgCommentOfPosts;
    }

    void calculateAdvStatistics(Statistics statistics) {
        numberPosts = statistics.postsCount();
        numberComment = statistics.commentsCount();
        numberUsers = statistics.usersNames().size();

        //users =0; users = 100;
        if (numberUsers != 0) {
            avgCommentOfUser = (double) numberComment / (double) numberUsers;
        }

        //comment>posts; comment < posts; comment == 0;
        if (numberComment != 0) {
            avgCommentOfPosts = (double) numberPosts / (double) numberComment;
        }

        //posts = 0; posts = 1000;
        if (numberPosts != 0) {
            avgPostOfUser = (double) numberUsers / (double) numberPosts;
        }
    }
    void showStatistics(){
        System.out.println("Numbers Users: " + numberUsers + " Numbers Posts: " + numberPosts +
                " Number Comments: " + numberComment + " Average comment of posts: " + avgCommentOfPosts
                + " Average comment of user: " + avgCommentOfUser + " Average post of user: " + avgPostOfUser);
    }

}

