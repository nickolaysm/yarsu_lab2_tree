package ru.yarsu.lab2tree;

/**
 * Входная точка для дерева
 */
public class Tree {


    public Node rootNode;

    public Tree(){
    }

    public Tree(String rootNodeName){
        rootNode = new Node(rootNodeName);
    }

    public Node createRootNode(String name){
        rootNode = new Node(name);
        return rootNode;
    }

    public Node getRootNode() {
        return rootNode;
    }

}
