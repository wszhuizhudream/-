package ds1.lianbiao;

/**链表的实现：
 * 对于链表最重要的也是插入和删除
 * Author:WSChase
 * Created:2019/3/30
 */
public interface ILinkedList {

    //需要注意的是对于我们的链表不存在在index位置插入、删除，因为它的物理位置并不是连续的


    //1.插入
    //（1）把item插入到顺序表最前面
    void pushFront(int item);

    //（2）把item插入到顺序表的最后
    void pushBack(int item);


    //（3）删除顺序表前面的数据
    void popFront();


    //（4）删除顺序表最后的数据
    void popBack();
}
