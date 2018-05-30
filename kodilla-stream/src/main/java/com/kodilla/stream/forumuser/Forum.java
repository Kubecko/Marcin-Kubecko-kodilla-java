package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theListUser = new ArrayList<>();

    public Forum(){
        theListUser.add(new ForumUser(1,"Martin",'M',1987,12,31,1));
        theListUser.add(new ForumUser(2,"Ahonen", 'M',1985,11,8,0));
        theListUser.add(new ForumUser(3,"Irena", 'F',1912,2,12,45));
        theListUser.add(new ForumUser(4,"Kamil", 'M',2010,9,5,15));
        theListUser.add(new ForumUser(5,"Justyna", 'F',2013,1,8,95));
        theListUser.add(new ForumUser(6,"Bjergen", 'F',1987,12,31,0));
        theListUser.add(new ForumUser(7,"Messi", 'M',2002,2,5,65));
        theListUser.add(new ForumUser(8,"Lewandowski", 'M',1988,2,5,15));
        theListUser.add(new ForumUser(9,"Ronaldo", 'M',2002,2,5,3));
        theListUser.add(new ForumUser(10,"CR7", 'M',1986,2,5,612));
    }
    public List<ForumUser> getUserList(){return new ArrayList<ForumUser>(theListUser);}
}
