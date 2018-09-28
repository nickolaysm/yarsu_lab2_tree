package ru.yarsu.lab2tree;

import java.util.Iterator;

/**
 * Входная точка для дерева
 */
public class Tree{


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

    public void iterateNodes(TreeIteratorHandler handler){
        iterateNodesInternal(0, getRootNode(), handler);
    }

    private void iterateNodesInternal(Integer level, Node node, TreeIteratorHandler handler){
        if(node != null) handler.handleNode(level, node);

        for (Node child: node.getChildrenIterator()) {
            iterateNodesInternal(level+1, child, handler);
        }
    }
}
