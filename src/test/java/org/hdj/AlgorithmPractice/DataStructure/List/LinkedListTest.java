package org.hdj.AlgorithmPractice.DataStructure.List;

import org.hdj.AlgorithmPractice.DataStructure.List.LinkedList.LinkedList;
import org.junit.Before;
import org.junit.Test;

/**
 * 链表测试
 */
public class LinkedListTest {

    private LinkedList<Integer> linkedList=new LinkedList<>();
    @Before
    public void init(){
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);
        linkedList.insertTail(4);
    }

    @Test
    public void testDisPlay(){
        linkedList.display();
    }

    @Test
    public void testIndexOf(){
        System.out.println(linkedList.indexOf(3));
        System.out.println(linkedList.indexOf(4));
        System.out.println(linkedList.indexOf(5));
    }

    @Test
    public void testInsert(){

        linkedList.insert(0,6);
        linkedList.insert(1,5);

        linkedList.display();
        linkedList.clear();
        linkedList.insert(0,6);
        linkedList.display();

        System.out.println(linkedList.size());
    }


    @Test
    public void testRemove(){

        linkedList.display();
        Integer remove = linkedList.remove(0);
//        System.out.println(remove);

        linkedList.display();
    }

    @Test
    public void testGet(){
        Integer integer = linkedList.get(0);

        System.out.println(integer);
    }
}
