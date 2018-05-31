package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theListUser = new ArrayList<>();

    public Forum(){
        theListUser.add(new ForumUser(1,"Martin",'M', LocalDate.of(1985,12,31),1));
        theListUser.add(new ForumUser(2,"Ahonen", 'M',LocalDate.of(1985,11,8),0));
        theListUser.add(new ForumUser(3,"Irena", 'F',LocalDate.of(1912,2,12),45));
        theListUser.add(new ForumUser(4,"Kamil", 'M',LocalDate.of(2010,9,5),15));
        theListUser.add(new ForumUser(5,"Justyna", 'F',LocalDate.of(2013,1,8),95));
        theListUser.add(new ForumUser(6,"Bjergen", 'F',LocalDate.of(1987,12,31),0));
        theListUser.add(new ForumUser(7,"Messi", 'M',LocalDate.of(2002,2,5),65));
        theListUser.add(new ForumUser(8,"Lewandowski", 'M',LocalDate.of(1988,2,5),15));
        theListUser.add(new ForumUser(9,"Ronaldo", 'M',LocalDate.of(2002,2,5),3));
        theListUser.add(new ForumUser(10,"CR7", 'M',LocalDate.of(1986,2,5),612));
    }
    public List<ForumUser> getUserList(){return new ArrayList<ForumUser>(theListUser);}
}
