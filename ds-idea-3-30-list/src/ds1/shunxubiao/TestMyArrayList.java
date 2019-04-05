package ds1.shunxubiao;

/**测试自己实现的顺序表
 * Author:WSChase
 * Created:2019/3/30
 */
public class TestMyArrayList {
    public static void main(String[] args) {
        //我们先实例化一个顺序表的对象，通过对象调用方法
        MyArrayList arrayList = new MyArrayList(10);
        //头插
        arrayList.pushFront(10);
        arrayList.pushFront(20);
        arrayList.pushFront(30);
        //头删
        arrayList.pushBack(1);
        arrayList.pushBack(2);
        arrayList.pushBack(3);
        //在index的位置插入
        arrayList.pushIndex(100, 3);
        arrayList.pushIndex(200, 4);
        arrayList.pushIndex(300, 5);
        arrayList.pushIndex(300, 5);
        //头删
        arrayList.popFront();
        arrayList.popFront();
        arrayList.popFront();
        //尾删
        arrayList.popBack();
        arrayList.popBack();
        arrayList.popBack();
        //删除index下标的元素
        arrayList.popIndex(0);
        arrayList.popIndex(0);
        arrayList.popIndex(0);
    }
}
