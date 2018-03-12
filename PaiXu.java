public class PaiXu {
public static void main(String[] args) {
	int paixu[]= {2,333,44,555,6,777,88,9,10};
	bubbleSort(paixu, 0, 8);
}
//将数列array从left至right冒泡排序
public static void bubbleSort(int[] array, int left, int right) {
	while(right>left) 
    {
		//初始化c(c用来定位最后一次发生交换的位置，之后的数已被排序，不需重复判断)
		int c=left;
        for(int i=left+1;i<=right;i++)
        {
        	if(array[i-1]>array[i])
        	{
			//交换位置并定位c
        		int a=array[i-1];
        		array[i-1]=array[i];
        		array[i]=a;
        		c=i-1;
        	}
        }
        //根据c确定下一次排序的范围
    	right=c;
    }
}
}
