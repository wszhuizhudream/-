package ds1.lianbiao;

/**
 * Author:WSChase
 * Created:2019/3/30
 */
public class MyLinkedList implements ILinkedList {
    //在进行操作之前我们先定义一个节点的类
    class Node{
        //在一个节点中有两部分：
        //（1）节点对应的有效数据
         public int value;
        //（2）下一个节点的线索
        public Node next;

        public Node(int value) {
            //当前节点的下一个节点需要我们寻找的
            this.value = value;
            this.next = null;
        }
    }

    // 如果链表中一个结点都没有,则head == null
    private Node head;      // 保存链表中第一个结点的引用

   public MyLinkedList() {
        //在创建一个链表的时候我们先将头节点置为null
        this.head = null;
    }

    /**
     * 在链表中的操作我们注重的是通过第一个节点找到链表，但是我们对于这个链表的长度我们并不会关心
     */

    /**
     * 头插
     * @param item
     */
    @Override
    public void pushFront(int item) {
        //首先将这个需要插入的数转化为一个节点类型
        //注意：对于下面的写法既包含了this.head=null又包含了this.head!=null的情况
        Node node=new Node(item);
        node.next=this.head;
        this.head=node;
    }

    /**
     * 尾插
     * @param item
     */
    //首先我们通过一个方法找到最后一个节点的位置
    public Node getLastNode(){
        Node cur=this.head;
        while (cur.next!=null){
            cur=cur.next;
        }
        return cur;
    }
    @Override
    public void pushBack(int item) {

        Node node=new Node(item);
        Node lastNode=getLastNode();
        lastNode.next=node;
    }


    /**
     * 头删
     */
    @Override
    public void popFront() {
//        if(this.head==null){
//            throw new Error();
//        }
        this.head=this.head.next;
        //this.head=null;
    }

    /**
     * 尾删:尾删的重点就是要找到倒数第二个元素的位置
     */
    public Node getLastlastNode(){
        Node cur = this.head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        return cur;
    }
    @Override
    public void popBack() {
        Node lastLast=getLastlastNode();
        lastLast.next=null;
    }
}
