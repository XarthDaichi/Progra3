/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorundo.presentation.coloredit;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Model extends Observable{
    int limit=6;
    List<Color> stack;

    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        commit();
    }
    
    public Model() { stack = new ArrayList<>(); }
    
    public Color getCurrent() {
        return stack.get(stack.size()-1);
    }
    
    public void change(Color c){
        if (stack.size()<limit){
            stack.add(c);
        }else{
            stack.remove(0);
            stack.add(c);
        }   
    }
    
    public void undo(){
        if(stack.size()>1){
            stack.remove(stack.size()-1);
            
        }
    }
    
    public void commit(){
        setChanged();
        notifyObservers(null);            
    }

}
