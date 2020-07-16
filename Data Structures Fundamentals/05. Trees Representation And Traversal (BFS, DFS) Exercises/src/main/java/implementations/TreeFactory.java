package implementations;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TreeFactory {
    private Map<Integer, Tree<Integer>> nodesByKeys;

    public TreeFactory() {
        this.nodesByKeys = new LinkedHashMap<>();
    }

    public Tree<Integer> createTreeFromStrings(String[] input) {
        for (String params : input) {
            int[] keys = Arrays.stream(params.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int parentKey = keys[0];
            int childKey = keys[1];


            this.addEdge(parentKey, childKey);
        }
        return getRoot();
    }

    private Tree<Integer> getRoot() {
        for (Tree<Integer> child : nodesByKeys.values()) {
            if (child.getParent() == null) {
                return child;
            }
        }
        return null;
    }

    public Tree<Integer> createNodeByKey(int key) {

        nodesByKeys.putIfAbsent(key, new Tree<>(key));
        return this.nodesByKeys.get(key);
    }

    public void addEdge(int parent, int child) {
        Tree<Integer> parentByKey = this.createNodeByKey(parent);
        Tree<Integer> childByKey = this.createNodeByKey(child);

        parentByKey.addChild(childByKey);
        childByKey.setParent(parentByKey);

    }
}



/*
package implementations;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TreeFactory {
    private Map<Integer, Tree<Integer>> nodesByKeys;

    public TreeFactory() {
        this.nodesByKeys = new LinkedHashMap<>();
    }

    public Tree<Integer> createTreeFromStrings(String[] input) {
        for(String params : input){
            int[] keys = Arrays.stream(params.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int parentKey = keys[0];
            int childKey = keys[1];
            //suzdavam durveta koito otgovarqt na tezi kluchove, ako veche gi imame szdadeni prosto shte trqbva
            // da gi vzemem

            //ili suzdava node ot tozi key ili go vrushta ko veche sushtestvuva
//            Tree<Integer> parentByKey = this.createNodeByKey(parentKey);
//            Tree<Integer> childByKey = this.createNodeByKey(childKey); dolnoto pravi sushtotot
            this.addEdge(parentKey, childKey);
        }
        return this.getRoot();
        //vrushtame durvoto - negoviq entry point - roota koito nqma predecessor predshestvenik
    }

    private Tree<Integer> getRoot() {
        for(Tree<Integer> value : nodesByKeys.values()){//za vsqka edna stoinost koqto e durvo mu vzimam parent
            if(value.getParent() == null){
                return value;
            }
        }
        return null;
    }

    public Tree<Integer> createNodeByKey(int key) {
        this.nodesByKeys.putIfAbsent(key, new Tree<>(key));//ako ne prisustva sloji novo durvo ot klucha
        return this.nodesByKeys.get(key);//vzima noda koito se namira na tekushtiq kluch i go vrushta
    }

    public void addEdge(int parent, int child) {
        //veche sum gi suzdal i sega trqbva da gi zakacha s tozi metod koito znae koi e parent i znae koi e child
        Tree<Integer> parentKey = this.createNodeByKey(parent);
        Tree<Integer> childByKey = this.createNodeByKey(child);

        parentKey.addChild(childByKey);
        childByKey.setParent(parentKey);

    }
}




 */