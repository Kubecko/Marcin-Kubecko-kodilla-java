package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForumUsers = new Forum();

        Map<Integer,ForumUser> theResultMapForumUser = theForumUsers.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(s -> s.getDateOfBirth().getYear() < 1999-1-1)
                .filter(s -> s.getNumberPostPublicate() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueId,forumUser ->forumUser));

        System.out.println("# elements: " + theResultMapForumUser.size() + "\n");
        theResultMapForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
