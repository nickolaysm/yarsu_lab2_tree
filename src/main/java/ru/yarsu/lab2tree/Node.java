package ru.yarsu.lab2tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Узел дерева.
 * Содержит список дочерних узлов
 * Умеет добавлять/удалять дочерний узел
 * Знает свое имя
 */
public class Node {
    private String name;
    private List<Node> children = new ArrayList<Node>();

    public Node(){
    }

    public Node(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node createNewChildNode(String name){
        Node child = new Node(name);
        children.add(child);
        return child;
    }

    public void removeChildNodeByName(String name){
        for(int i = 0; i < children.size(); i++){
            if ( children.get(i).getName().equals(name) ){
                children.remove(i);
                break;
            }
        }
    }

    public void removeAllChildren(){
        children.clear();
    }

    public Node getChildByName(String childNodeName){
        for(int i = 0; i < children.size(); i++){
            if ( children.get(i).getName().equals(childNodeName) ){
                return children.get(i);
            }
        }
        return null;
    }

    public Iterable<Node> getChildrenIterator(){
        return children;
    }

}
