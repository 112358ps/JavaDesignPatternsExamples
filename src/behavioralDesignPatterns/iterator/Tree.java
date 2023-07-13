package behavioralDesignPatterns.iterator;


public class Tree {

    Node root;
    
    Node getRoot(){
        return root;
    }

    public void addRoot(Node root){
        this.root = root;
    }

    public void addChildLink(Node parent , Node child){
        parent.addChild(child);
    }
}
