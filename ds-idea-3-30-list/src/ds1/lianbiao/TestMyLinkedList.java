package ds1.lianbiao;

/**
 * Author:WSChase
 * Created:2019/3/30
 */
public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        //头插
        myLinkedList.pushFront(8);
        myLinkedList.pushFront(6);
        myLinkedList.pushFront(12);
        //尾插
        myLinkedList.pushBack(2);
        myLinkedList.pushBack(18);
        myLinkedList.pushBack(5);

        //头删
        myLinkedList.popFront();
        myLinkedList.popFront();
        myLinkedList.popFront();

        //尾删
        myLinkedList.popBack();
        myLinkedList.popBack();
        myLinkedList.popBack();
    }
}
