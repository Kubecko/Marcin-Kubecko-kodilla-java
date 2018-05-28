package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import com.kodilla.testing.forum.statistics.CalculateStatistic;
import com.kodilla.testing.forum.statistics.Statistics;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestMock {

    @Test
    public void TestCalcUser0() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> listUsers0 = new ArrayList<>();
        int commUsers = 0;

        when(statisticMock.usersNames()).thenReturn(listUsers0);
        when(statisticMock.commentsCount()).thenReturn(commUsers);

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticMock);
        calculateStatistic.calculateAdvStatistics(statisticMock);
        //When
        double numberUsersOfZero = calculateStatistic.getAvgCommentOfUser();

        //Then
        Assert.assertEquals(0, numberUsersOfZero, 0.01);
    }
    @Test
    public void TestCalcUser100() {
        //Given
        Statistics statisticUser100Mock = mock(Statistics.class);
        List<String> listUser100 = new ArrayList<>();
        for(int n = 0; n < 100; n++){
            listUser100.add("Marcin #" + n);
        }
        int commUser = 200;

        when(statisticUser100Mock.usersNames()).thenReturn(listUser100);
        when(statisticUser100Mock.commentsCount()).thenReturn(commUser);

        CalculateStatistic calculateUsers100 = new CalculateStatistic(statisticUser100Mock);
        calculateUsers100.calculateAdvStatistics(statisticUser100Mock);
        //When
        double numberUsers100 = calculateUsers100.getAvgCommentOfUser();

        //Then
        Assert.assertEquals(2, numberUsers100, 0.01);
    }
    @Test
    public void TestCalcCommentMorePosts(){
        //Given
        Statistics statisticCommOfPostsMock = mock(Statistics.class);
        int commentCount = 200;
        int postsCount = 40;

        when(statisticCommOfPostsMock.commentsCount()).thenReturn(commentCount);
        when(statisticCommOfPostsMock.postsCount()).thenReturn(postsCount);

        CalculateStatistic calculateCommOfPosts = new CalculateStatistic(statisticCommOfPostsMock);
        calculateCommOfPosts.calculateAdvStatistics(statisticCommOfPostsMock);
        //When
        double numberCommOfPosts = calculateCommOfPosts.getAvgCommentOfPosts();

        //Then
        Assert.assertEquals(0.2,numberCommOfPosts,0.01);
    }
    @Test
    public void TestCalcPostsMoreComment(){
        //Given
        Statistics stPostOfComment = mock(Statistics.class);
        int postsCount = 1000;
        int commentCount = 50;

        when(stPostOfComment.postsCount()).thenReturn(postsCount);
        when(stPostOfComment.commentsCount()).thenReturn(commentCount);

        CalculateStatistic postsOfComment = new CalculateStatistic(stPostOfComment);
        postsOfComment.calculateAdvStatistics(stPostOfComment);
        //When
        double postOfComment = postsOfComment.getAvgCommentOfPosts();

        //Then
        Assert.assertEquals(20, postOfComment, 0.01);
    }
    @Test
    public void TestCalcCommentOf0(){
        //Given
        Statistics stCommentOf0 = mock(Statistics.class);
        int commentOf0 = 0;
        int postCount = 5;
        when(stCommentOf0.commentsCount()).thenReturn(commentOf0);
        when(stCommentOf0.postsCount()).thenReturn(postCount);
        CalculateStatistic commentedOf0 = new CalculateStatistic(stCommentOf0);
        commentedOf0.calculateAdvStatistics(stCommentOf0);
        //When
        double comments = commentedOf0.getAvgCommentOfPosts();

        //Then
        Assert.assertEquals(0,comments, 0.01);
    }
    @Test
    public void TestCalcPostsOf0 (){
        Statistics stPostsOf0 = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("Martin # ");
        int posts = 0;

        when(stPostsOf0.postsCount()).thenReturn(posts);
        when(stPostsOf0.usersNames()).thenReturn(users);

        CalculateStatistic stPosts100 = new CalculateStatistic(stPostsOf0);
        stPosts100.calculateAdvStatistics(stPostsOf0);
        //When
        double post = stPosts100.getAvgPostOfUser();

        //Then
        Assert.assertEquals(0, post,0.01);
    }
    @Test
    public void TestCalcPostsOf1000 (){
        Statistics stPostsOf1000 = mock(Statistics.class);
        List<String> users2 = new ArrayList<>();
        for (int n=0; n < 50; n++){
            users2.add("Martin # " + n);
        }
        int post = 1000;

        when(stPostsOf1000.postsCount()).thenReturn(post);
        when(stPostsOf1000.usersNames()).thenReturn(users2);

        CalculateStatistic posts1000 = new CalculateStatistic(stPostsOf1000);
        posts1000.calculateAdvStatistics(stPostsOf1000);
        //When
        double posts = posts1000.getAvgPostOfUser();

        //Then
        Assert.assertEquals(0.05,posts,0.01);
    }
}
