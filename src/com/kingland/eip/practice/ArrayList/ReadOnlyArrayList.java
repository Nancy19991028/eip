package com.kingland.eip.practice.ArrayList;

import org.omg.CORBA.Object;

import java.util.ArrayList;


public class ReadOnlyArrayList<E> extends ArrayList<E> {
    private  final ArrayList<E> arrayList;

    public ReadOnlyArrayList(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }
    public ArrayList<E> getArrayList() {
    return arrayList;
    }
    @Override
    public void trimToSize(){
        arrayList.trimToSize();
    }
    @Override
    public void ensureCapacity(int var1){
        arrayList.ensureCapacity(var1);
    }
    @Override
    public int size() {
        return arrayList.size();
    }


}



