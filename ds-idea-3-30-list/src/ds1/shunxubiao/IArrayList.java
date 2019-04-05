package ds1.shunxubiao;

/**我们自己来实现顺序表：
 * 对于顺序表最重要的是增、删，下面我们将从增删来看一下怎么实现顺序表
 * Author:WSChase
 * Created:2019/3/30
 */
interface IArrayList {
    //首先item是要插入的数据

    //1.插入
    //（1）把item插入到顺序表最前面
    void pushFront(int item);

    //（2）把item插入到顺序表的最后
    void pushBack(int item);

    //（3）把item插入到顺序表的index位置
    void pushIndex(int item, int index);

    //（4）删除顺序表前面的数据
    void popFront();

    //（5）删除index位置的数据
    void popIndex(int index);

    //（6）删除顺序表最后的数据
    void popBack();
}
