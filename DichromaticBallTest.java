/*
	ʵ��˫ɫ��齱��Ϸ�н���������ɣ��н������� 6 ���������� 1 �����������ɡ� ���к������Ҫ��������� 6 �� 1~33 ֮�䲻�ظ���������롣 �����������Ҫ��������� 1 �� 1~16 ֮���������롣 
 */
 import java.util.Random;
 public class DichromaticBallTest{
	
	public static void main(String[] args){
		
		//�����������ռ�������������
		int i = 0;
		int[] arr = new int[6];
		Random rm = new Random();
		//ʹ��forѭ����ÿ�������±긳���������
		outer: while(i<6){
			arr[i] = rm.nextInt(33)+1;
			//�ж��Ƿ��֮ǰ������һ�������һ�������±��1
			if(i>0){
				for(int j=0;j<i;j++){
					if(arr[j] == arr[i]){
						continue outer;
					}
				}
			}
			i++;
		}
		//�����������
		int blue = rm.nextInt(16)+1;
		//��ʾ7�����ֵ
		System.out.print("����˫ɫ���н�����Ϊ��");
		for(int a=0;a<6;a++){
			System.out.print(arr[a] + " ");
		}
		System.out.print(blue);
	}
 }