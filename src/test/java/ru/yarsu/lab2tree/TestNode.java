package ru.yarsu.lab2tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNode {

    static String rootName = "Нода 1";
    static String rootNameChanged = "Нода 1 альтернативная";

    static String childNodeName = "Нода 1.1";

    Node rootNode;

    @BeforeEach
    void init() {
        rootNode = new Node(rootName);
    }

    @Test
    void testCreateNewChildNode(){
        rootNode.createNewChildNode(childNodeName);
        Node childNode = rootNode.getChildByName(childNodeName);
        assertEquals(childNodeName, childNode.getName());
    }

    @Test
    void testRemoveChild(){
        rootNode.createNewChildNode(childNodeName);
        rootNode.removeChildNodeByName(childNodeName);
        Node childNode = rootNode.getChildByName(childNodeName);
        assertEquals(null, childNode);
    }

    @Test
    void testChangeNodeName(){
        rootNode.setName(rootNameChanged);
        assertEquals(rootNameChanged, rootNode.getName());
    }

    @Test
    void testRemoveAll(){
        rootNode.createNewChildNode(childNodeName);
        rootNode.removeAllChildren();

        assertEquals(null, rootNode.getChildByName(childNodeName));
    }

}
