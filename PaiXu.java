public class PaiXu {
public static void main(String[] args) {
	int paixu[]= {2,333,44,555,6,777,88,9,10};
	bubbleSort(paixu, 0, 8);
}
//������array��left��rightð������
public static void bubbleSort(int[] array, int left, int right) {
	while(right>left) 
    {
		//����c��λ���һ�η���������λ�ã�֮������ѱ����򣬲����ظ��ж�
		int c=left;
        for(int i=left+1;i<=right;i++)
        {
        	//����λ�ò���λc
        	if(array[i-1]>array[i])
        	{
        		int a=array[i-1];
        		array[i-1]=array[i];
        		array[i]=a;
        		c=i-1;
        	}
        }
        //����cȷ����һ������ķ�Χ
    	right=c;
    }
}
}