package _01Generics;

import java.util.ArrayList;

public class MyArrayList <E>{
    private ArrayList mylist=new ArrayList();
    public boolean add(E e){
        mylist.add(e);
        return true;
    }
    public boolean remove(E e){
        return mylist.remove(e);
    }
    public String toString(){
        return mylist.toString();
    }
}
