package javaPOC.DataStructure.BinaryTrees.Rough;

import java.util.ArrayList;

/**
 * Created by Arpan on 10/19/17.
 */
public class GeneralTree {
    nod head;

    public void add(String str){

        nod toAdd = new nod(str);

      //  if(head)

    }

    public void traverse(){

        nod parent = new nod();

        parent = head;


    }
}

class nod<String>{

    ArrayList<nod<String>> al = new ArrayList<nod<String>>();
    String value;

    nod(){}

    nod(String s){
        value = s;
        al = null;
    }
}