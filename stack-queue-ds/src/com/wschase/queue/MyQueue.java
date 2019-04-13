package com.wschase.queue;

/**队列：
 * 队列的特点就是先进先出，它的实现方法也可以采用改造的顺序表/单链表（头删+尾插）
 * 我们采用单链表来实现队列
 * Author:WSChase
 * Created:2019/4/6
 */

/**
 * 链表的结点类
 */
class Node{
    int val;
    Node next;
}

/**
 * 队列的类
 */
class Queue{
  Node head;
  Node last;
}

public class MyQueue {
    /**
     * 下面是队列一些方法的实现
     * 注意：我们对队列的操作就是对链表的头删和尾插
     */
    //1.队列的初始化
    public void queueInit(Queue q){
        q.head=q.last=null;
    }

    //2.尾插--进栈
    public void queuePush(Queue q,int v){
        //首先将我们需要插入的值转化为一个结点
        Node node=new Node();
        node.val=v;
        node.next=null;
        if(q.head==null){
            q.head=q.last=node;
        }else {
            q.last.next=node;
            q.last=node;
        }
    }

    //3.头删--出栈
    public void queuePop(Queue q){
        q.head=q.head.next;
        if(q.head==null){
            q.last=null;
        }
    }

    //4.查看队首元素
    public int queueFront(Queue q){
        return q.head.val;
    }

    //5.返回队列元素个数
    public int queueSize(Queue q){
        int size=0;
        for(Node cur=q.head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }

    //6.判断队列是否为空
    public boolean isQueueEmpty(Queue q){
        return q.head==null;
    }
}
