/* 
	����ҳ� 1000 ���ڵ�������������ӡ������ ��ν��������һ����ǡ�õ�����������֮�ͣ��磺6=1��2��3
 */
public class PerfectNumberTest{
	
	public static void main(String[] args){
		
		//������������б���
		for(int i=1;i<=1000;i++){
			
			int sum = 0;
			//�ж�������������Ƿ������
			for(int j=1;j<i;j++){
				
				if(0 == i % j){
					sum += j;
				}
			}
			if(sum == i){
				System.out.println(i);
			}
		}
		
	}
}