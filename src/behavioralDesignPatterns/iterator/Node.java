package behavioralDesignPatterns.iterator;

import java.util.ArrayList;

public  class Node{
    int val;
    ArrayList<Node> children;
    Node(int val){
        this.val = val;
    }
    void addChild(Node child){
        if(children == null){
            this.children = new ArrayList<Node>();
        }
        this.children.add(child);
    }
}