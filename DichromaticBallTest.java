/*
	实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。 其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。 
 */
 import java.util.Random;
 public class DichromaticBallTest{
	
	public static void main(String[] args){
		
		//定义红球数组空间和随机数生成器
		int i = 0;
		int[] arr = new int[6];
		Random rm = new Random();
		//使用for循环给每个数组下标赋上随机数字
		outer: while(i<6){
			arr[i] = rm.nextInt(33)+1;
			//判断是否和之前的数字一样，如果一样跳过下标加1
			if(i>0){
				for(int j=0;j<i;j++){
					if(arr[j] == arr[i]){
						continue outer;
					}
				}
			}
			i++;
		}
		//生成篮球号码
		int blue = rm.nextInt(16)+1;
		//显示7个球的值
		System.out.print("本次双色球中奖号码为：");
		for(int a=0;a<6;a++){
			System.out.print(arr[a] + " ");
		}
		System.out.print(blue);
	}
 }