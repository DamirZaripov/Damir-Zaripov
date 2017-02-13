/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.istamendil.notebook.data;

import info.istamendil.notebook.data.Db;
import info.istamendil.notebook.data.DbException;
import java.util.ArrayList;

/**
 *
 * @author Rubingood
 */
public class MyDB implements Db  {
    
    private ArrayList<Object> objects;
    
    public MyDB() {
        objects = new ArrayList<>();
    }
    
    @Override
    public void save(Object obj) throws DbException {
        objects.add(obj); // добавляем элемент в массив
    } 

    @Override
    public Object[] findAll() throws DbException {
       return objects.toArray(new Object[objects.size()]); //из array list в массив с размерностью size от objects
    }
    
}