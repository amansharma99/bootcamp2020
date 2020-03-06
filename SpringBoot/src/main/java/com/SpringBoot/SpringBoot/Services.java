package com.SpringBoot.SpringBoot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class Services {
    public static List<Employees> E_List = new ArrayList<>();
    static int i=3;
    static {
        E_List.add(new Employees("Aman", 1, 21));
        E_List.add(new Employees("Manish", 2, 22));
        E_List.add(new Employees("Chirag", 3, 24));
    }

    public List<Employees> Allemp() {
        return E_List;
    }

    public Employees getemp(int id) {
        for (Employees e : E_List) {
            if (e.getE_id() == id) {
                return e;
            }
        }
        return null;
    }
    public void addemp(Employees e)
    {
        i++;E_List.add(e);
    }
    public Employees delemp(int id)
    {
        Iterator<Employees> employeesIterator=E_List.iterator();
        while(employeesIterator.hasNext())
        {
            Employees e1=employeesIterator.next();
            if(e1.getE_id()==id)
            {employeesIterator.remove();
              i--;
                return e1;}
        }
        return null;
    }

    public Employees updatemp(int id,Employees e) {
        Iterator<Employees> employeesIterator=E_List.iterator();
        while(employeesIterator.hasNext())
        {
            Employees e1=employeesIterator.next();
            if(id<=i)
            {
                if(e1.getE_id()==id)
                {
                    e1.setE_id(e.getE_id());
                    e1.setAge(e.getAge());
                    e1.setE_name(e.getE_name());
                    return e1;
                }
            }
            else
            {
                throw new UserNotFoundException("Id:"+id);
            }
        }
        return null;
    }
}