/*
	�ö�ά�����ѭ��ʵ����������Ϸ���̵Ļ��� 
 */
import java.util.Arrays;
 public class FiveStoneTest{
	
	public static void main(String[] args){
			
		//����һ����ά����
		String[][] arr = new String[17][17];
		//˫��Ƕ��ѭ����������ֵ
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				//�жϵ�һ�м���һ��
				if(i==0){
					if(j==0){
						arr[i][j] = " ";
					}else if(j<11){
						arr[i][j] = (j-1)+"";
					}else{
						arr[i][j] = (char)(j + 86)+"";
					}
				}else if(j==0){
					if(0<i && i<11){
						arr[i][j] = (i-1)+"";
					}else{
						arr[i][j] = (char)(i + 86)+"";
					}
				}else{
					arr[i][j] = "+";
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
 }