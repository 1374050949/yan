/* 
	编程找出 1000 以内的所有完数并打印出来。 所谓完数就是一个数恰好等于它的因子之和，如：6=1＋2＋3
 */
public class PerfectNumberTest{
	
	public static void main(String[] args){
		
		//保存变量并进行遍历
		for(int i=1;i<=1000;i++){
			
			int sum = 0;
			//判断整除的数相加是否等于数
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