package ds1;

/**二分查找
 * Author:WSChase
 * Created:2019/3/30
 */
public class Test1 {
    public int check(int[] array,int num){
        //int[] a={1,4,6,8,2,10}
        int left=0;
        int right=array.length-1;
        int mid;
        while (left<=right){
            mid=left+(right-left)/2;
            if(num==array[mid]){
                return mid;
            }else if(num<array[mid]){
                right=mid-1;
            }else {
                left=mid;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Test1 test1=new Test1();
        int result=test1.check(new int[]{1,4,6,8,2,10},6);
        System.out.println(result);

    }
}
