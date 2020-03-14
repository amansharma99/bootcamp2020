package com.SpringRestFulPart2.SpringRestFulPart2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component

public class  Service {
    public static List<User> UsersList = new ArrayList<User>();
    static {
        UsersList.add(new User(1,"Aman",21,"12345"));
        UsersList.add(new User(2,"Jo",22,"23456"));
        UsersList.add(new User(3,"Karan",23,"34567"));
    }
    static int i=3;

    ////////////////////////////////////////////////////////////////////////

    public List<User> allUsers() { return UsersList; }

    /////////////////////////////////////////////////////////////////////////

    public User getUser(int id)
    {
        for(User u: UsersList)
        {
            if(u.getId()==id)
                return u;
        }
        return null;
    }

    ////////////////////////////////////////////////////////////////////////

    public User deleteUser(int id)
    {
        Iterator<User> usersIterator= UsersList.iterator();
        while (usersIterator.hasNext())
        {
            User u=usersIterator.next();
            if(u.getId()==id)
            { usersIterator.remove(); i--; return u;}
        }
        return null;
    }

    //////////////////////////////////////////////////////////////////////////

    public User updateUser(int id, User u)
    {
        Iterator<User> usersIterator= UsersList.iterator();
        while(usersIterator.hasNext())
        {
            User u1=usersIterator.next();
            if (u1.getId()==id)
            {
                u1.setId(u.getId());
                u1.setAge(u.getAge());
                u1.setName(u.getName());
                return u1;
            }
            else
            {
                throw new UserNotFoundException("Id:"+id);
            }
        }
        return null;
    }

    ///////////////////////////////////////////////////////////////////////////

    public User addUser(User u)
    {
        UsersList.add(u);
        i++;
        return u;
    }
}