/*
	��ʾ�û�������������Ϣ���ж���һ������һ���еĵڼ��첢��ӡ��
 */
 
import java.util.Scanner;
public class YearMonthDayTest{
	
	public static void main(String[] args){
		
		//�����ʾ��,����ɨ�������ñ��������û�������
		Scanner sc = new Scanner(System.in);
		System.out.println("�ó�����Ը��������ж�����һ���еĵڼ��죡");
		System.out.println("�������꣺");
		int year = sc.nextInt();
		System.out.println("�������£�");
		int month = sc.nextInt();
		System.out.println("�������գ�");
		int day = sc.nextInt();
		int count = 0;
		//�ж��Ƿ�Ϊ���겢�������������
		if(month >=2){
			if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
				
				switch(month-1){
					case 12 : count = 0;
					case 11 : count += 30;
					case 10 : count += 31;
					case 9 : count += 30;
					case 8 : count += 31;
					case 7 : count += 31;
					case 6 : count += 30;
					case 5 : count += 31;
					case 4 : count += 30;
					case 3: count += 31;
					case 2 : count += 28;
					case 1 : count += 31 ;break;
					default:
						System.out.println("����������������룡");
				}
				count += day;
			}else{
				switch(month-1){
					case 12 : count = 0;
					case 11 : count += 30;
					case 10 : count += 31;
					case 9 : count += 30;
					case 8 : count += 31;
					case 7 : count += 31;
					case 6 : count += 30;
					case 5 : count += 31;
					case 4 : count += 30;
					case 3: count += 31;
					case 2 : count += 29 ;
					case 1 : count += 31 ;break;
					default:
						System.out.println("����������������룡");
				}
				count += day;
			}
		}else{
			
			count = day;
			
		}
		//��ӡ���������
		System.out.println("�ܹ���" + count + "��");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}