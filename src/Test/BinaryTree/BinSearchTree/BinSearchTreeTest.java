package BinaryTree.BinSearchTree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinSearchTreeTest {

    BinSearchTree bTree=new BinSearchTree();
    @Test
    public void add() {
bTree.add(5);
bTree.add(1);
bTree.add(8);
bTree.add(3);
bTree.add(7);
bTree.add(9);
bTree.add(4);
        System.out.println(bTree.contains(250));
    }

    @Test
    public void getNin() {
        bTree.add(5);
        bTree.add(1);
        bTree.add(8);
        bTree.add(3);
        bTree.add(7);
        bTree.add(9);
        bTree.add(4);
    System.out.println(bTree.getMin());
    }

    @Test
    public void getMax() {

        bTree.add(5);
        bTree.add(1);
        bTree.add(8);
        bTree.add(3);
        bTree.add(7);
        bTree.add(9);
        bTree.add(4);
    System.out.println(bTree.getMax());
    }

    @Test
    public void removeMax() {
    }

    @Test
    public void removeMin() {
        bTree.add(5);
        bTree.add(1);
        bTree.add(8);
        bTree.add(3);
        bTree.add(7);
        bTree.add(9);
        bTree.add(4);
        System.out.println(bTree.getSize());
        List fromMintoMax=new ArrayList();
        while (bTree.getSize()!=0)
        { fromMintoMax.add(bTree.removeMin());}
           // bTree.setRoot(bTree.removeMinNode(bTree.getRoot())); }
            System.out.println(fromMintoMax); }

    @Test
    public void remove() {
    }

    @Test
    public void getSize() {
    }

    @Test
    public void preOrder() {
    }

    @Test
    public void inOrder() {
    }

    @Test
    public void postOrder() {
    }
}