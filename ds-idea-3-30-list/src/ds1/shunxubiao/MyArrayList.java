package ds1.shunxubiao;

/**下面我们自己来实现顺序表
 * Author:WSChase
 * Created:2019/3/30
 */
public class MyArrayList implements IArrayList {

    //首先开辟一个保存数据的空间
    private int[] array;

    //然后定义一个有效数据的长度
    private  int size;

    //在实例化这个顺序表的时候先传进来一个这个顺序表的容量并且知道这个容器中装了多少个数——通过构造方法来实现
    public MyArrayList(int capacity){
            this.array = new int[capacity];
            this.size = 0;

    }

    /**
     * 头插：插入我们都是将数据从前面往后面移动
     * @param item
     */
    @Override
    public void pushFront(int item) {
        //首先判断如果这个顺序表里面放的是0，那么就是直接插入
        if(this.array[0]==0){
            this.array[0]=item;
        }else {
            for(int i=this.size;i>=1;i--){
                this.array[i]=array[i-1];
            }
            this.array[0]=item;
        }
            //不管是哪种情况，等把数据存进去了以后，这个顺序表里面有效数据的个数就会改变，所以我们需要将size进行加1操作
            this.size++;
    }

    /**
     * 尾插
     * @param item
     */
    @Override
    public void pushBack(int item) {
        //我们还是需要先考虑这个顺序表里面尾这个位置是否已经有数据了
        if(this.array[size-1]==0){
            this.array[size-1]=item;
        }else {
            this.array[size]=item;
        }
        //同样的，不管是哪种情况我们进行了插入以后准许表中的数据就已经增加了，需要将size加1
        this.size++;

    }

    /**
     * 在index位置插入元素
     * @param item
     */
    @Override
    //(1)以空间为主
    public void pushIndex(int item,int index) {
        if(this.array[index]==0){
            this.array[index]=index;
        }else {
            for(int i=this.size-1;i>=index;i--){
                //后面的空间永远都是最后一个空着的空间
                this.array[i+1]=this.array[i];
            }
            this.array[index]=item;
        }
        this.size++;
    }

    //（2）以数据长度为主
//    public void pushIndex(int item, int index) {
//        if (index < 0 || index > this.size) {
//            throw new Error();
//        }
//
//        // i 代表的是数据所在的下标
//        for (int i = this.size - 1; i >= index; i--) {
//            this.array[i + 1] = this.array[i];
//        }
//
//        this.array[index] = item;
//        this.size++;
//    }

    /**
     * 头删:在删除中我们做的操作都是将数据从后面往前面移动
     */
    @Override
    public void popFront() {
        if(this.size==0){
            throw new Error();

        }
            for(int i=0;i<=this.size-2;i++){
                this.array[i]=this.array[i+1];
            }
            this.array[0]=0;
        this.size--;
    }

    /**
     * 在index位置删除数据
     * @param index
     */
    @Override
    public void popIndex(int index) {


        if(this.size==0){
            throw new Error();

        }            for(int i=index;i<=this.size-2;i++){
                this.array[i]=this.array[i+1];
            this.array[index]=0;
        this.size--;
        }
    }

    /**
     * 尾删
     */
    @Override
    public void popBack() {

        if(this.size==0){
            throw new Error();

        }
        this.array[size-1]=0;
        this.size--;

    }
}
