package com.wschase.stack;

/**栈：
 * 首先对于栈的实现我们有两种方法：顺序表、链表；但是我们只需要掌握顺序表实现就可以了
 * 对于栈：有一个栈底（bottom）、栈顶（top）——表示当前栈顶的元素
 * Author:WSChase
 * Created:2019/4/6
 */

/**
 * 这个栈这个类——它就是我们的顺序表，所以它里面的属性和我们的顺序表是一样的，都是一个数组和数组元素的个数
 * 注意：我们先不考虑扩容的情况
 */
class Stack{
    int array[];
    //表示当前栈里面元素的个数
    int top;

}
public class MyStack {
    /**
     * 下面实现栈的一些基本方法
     */
    //1.栈的初始化
    public void stackInit(Stack s){
        s.top=0;
    }

    //2.进栈：给定一个栈、给定一个元素——需要将这个元素放进栈里面
    public void stackPush(Stack s,int v){
        //由于我们的栈有先进后出的特性，所以我们只能对尾部进行操作，所以实际上就是做顺序表的尾插
        s.array[s.top++]=v;
    }

    //3.出栈
    public void stackPop(Stack s){
        s.top--;
    }

    //4.查看栈顶元素
    public int stackTop(Stack s){
        return s.array[s.top-1];
    }

    //5.查看元素个数
    public int stackSize(Stack s){
        return s.top;
    }

    //6.判断栈是否为空
    public boolean isStackEmpty(Stack s){
        return s.top==0;
    }
}
