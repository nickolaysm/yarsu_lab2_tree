package ru.yarsu.lab2tree;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

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

    @Test
    void iteratorTest(){
        Tree tree = new Tree(rootName);
        tree.getRootNode().createNewChildNode("Нода 1.1");
        tree.getRootNode().createNewChildNode("Нода 1.2");
        tree.getRootNode().getChildByName("Нода 1.1").createNewChildNode("Нода 1.1.1");

        AtomicInteger testCount = new AtomicInteger(0);
        tree.iterateNodes((level, node)->{
            if("Нода 1.1.1".equals(node.getName())){
                assertEquals(new Integer(2), level);
                testCount.getAndIncrement();
            }else{
                testCount.getAndIncrement();
            }

        });
        assertEquals(4, testCount.get());

    }

}
