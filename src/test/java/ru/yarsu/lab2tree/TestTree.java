package ru.yarsu.lab2tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTree {

    static String rootName = "Нода 1";

    @Test
    void rootCreation(){
        Tree tree = new Tree();
        tree.createRootNode(rootName);
        assertEquals(rootName, tree.getRootNode().getName());
    }

    @Test
    void rootCreationFromConstructor(){
        Tree tree = new Tree(rootName);
        assertEquals(rootName, tree.getRootNode().getName());
    }

}
