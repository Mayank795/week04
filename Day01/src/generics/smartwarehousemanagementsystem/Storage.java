package com.generics.smartwarehousemanagementsystem;
import java.util.ArrayList;
import java.util.List;

class Storage <T extends WarehouseItem>{
    private List<T> items=new ArrayList<>();
    public void addItem(T value){
        items.add(value);
    }
    public List<T>getItems(){
        return items;
    }
}
