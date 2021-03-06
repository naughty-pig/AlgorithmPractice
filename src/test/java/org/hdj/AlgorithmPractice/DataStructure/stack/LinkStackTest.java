package org.hdj.AlgorithmPractice.DataStructure.stack;

import org.hdj.AlgorithmPractice.DataStructure.Stack.LinkStack.LinkStack;
import org.junit.Before;
import org.junit.Test;

public class LinkStackTest {

    private LinkStack<Integer> linkStack = new LinkStack<>();

    @Before
    public void init() {
        linkStack.push(2);
        linkStack.push(5);
        linkStack.push(9);
    }

    @Test
    public void testDisplay(){
        linkStack.display();
    }

    @Test
    public void testPop(){
        System.out.println(linkStack.size());
        Integer pop = linkStack.pop();
         pop = linkStack.pop();
         pop = linkStack.pop();
         pop = linkStack.pop();
        System.out.println(pop);

        System.out.println(linkStack.size());
    }

    @Test
    public void testPeek(){
        Integer peek = linkStack.peek();
        System.out.println(peek);

        System.out.println(linkStack.size());
    }
}
