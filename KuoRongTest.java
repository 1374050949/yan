/*
	�Զ����������ݹ��򣬵��Ѵ洢Ԫ�������ﵽ�������� 80%ʱ������ 1.5 ���� ���磬�������� 10��������� 8 ��Ԫ��ʱ������������ݣ������� 10 �� 15�� 
 */
import java.util.Scanner;

public class KuoRongTest{

    public static void main(String[] args){
    	
		//�Զ������������������
    	System.out.println("�����������������");
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int[] arr = new int[num];
		//ѭ����������и�ֵ���������ڰٷ�֮80
    	int i = 0;
    	while (i < (arr.length-1)*0.8){
    		System.out.println("�������"+(i+1)+"����");
    		arr[i] = sc.nextInt();
    		i++;
    		
    	}
		//���������µ�����������ݣ��Լ���ԭ�����ֵ���и�ֵ
    	int[] brr = new int[new Double(num*1.5).intValue()];
    	System.arraycopy(arr,0,brr,0,(i-1));
    	System.out.println(brr.length);
    }

}