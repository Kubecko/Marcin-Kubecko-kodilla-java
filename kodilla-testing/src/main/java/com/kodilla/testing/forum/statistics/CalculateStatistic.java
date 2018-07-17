package com.kodilla.testing.forum.statistics;

public class CalculateStatistic {
    private Statistics statistics;
    private int numberUsers;
    private int numberPosts;
    private int numberComment;
    private double avgPostOfUser;
    private double avgCommentOfUser;
    private double avgCommentOfPosts;

    public CalculateStatistic(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberUsers() {
        return this.numberUsers;
    }

    public int getNumberPosts() {
        return this.numberPosts;
    }

    public int getNumberComment() {
        return this.numberComment;
    }

    double getAvgPostOfUser() {
        return this.avgPostOfUser;
    }

    double getAvgCommentOfUser() {
        return this.avgCommentOfUser;
    }

    double getAvgCommentOfPosts() {
        return this.avgCommentOfPosts;
    }

    void calculateAdvStatistics(Statistics statistics) {
        this.numberPosts = statistics.postsCount();
        this.numberComment = statistics.commentsCount();
        this.numberUsers = statistics.usersNames().size();
        if (this.numberUsers != 0) {
            this.avgCommentOfUser = (double)this.numberComment / (double)this.numberUsers;
        }

        if (this.numberComment != 0) {
            this.avgCommentOfPosts = (double)this.numberPosts / (double)this.numberComment;
        }

        if (this.numberPosts != 0) {
            this.avgPostOfUser = (double)this.numberUsers / (double)this.numberPosts;
        }

    }

    void showStatistics() {
        System.out.println("Numbers Users: " + this.numberUsers + " Numbers Posts: " + this.numberPosts + " Number Comments: " + this.numberComment + " Average comment of posts: " + this.avgCommentOfPosts + " Average comment of user: " + this.avgCommentOfUser + " Average post of user: " + this.avgPostOfUser);
    }
}
