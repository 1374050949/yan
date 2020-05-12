/*
	提示用户输入年月日信息，判断这一天是这一年中的第几天并打印。
 */
 
import java.util.Scanner;
public class YearMonthDayTest{
	
	public static void main(String[] args){
		
		//输出提示语,创建扫描器并用变量保存用户的输入
		Scanner sc = new Scanner(System.in);
		System.out.println("该程序可以根据日期判断这是一年中的第几天！");
		System.out.println("请输入年：");
		int year = sc.nextInt();
		System.out.println("请输入月：");
		int month = sc.nextInt();
		System.out.println("请输入日：");
		int day = sc.nextInt();
		int count = 0;
		//判断是否为润年并算出该月总天数
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
						System.out.println("输入错误请重新输入！");
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
						System.out.println("输入错误请重新输入！");
				}
				count += day;
			}
		}else{
			
			count = day;
			
		}
		//打印结果到界面
		System.out.println("总共有" + count + "天");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}