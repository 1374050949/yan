/*
	用二维数组和循环实现五子棋游戏棋盘的绘制 
 */
import java.util.Arrays;
 public class FiveStoneTest{
	
	public static void main(String[] args){
			
		//创建一个二维数组
		String[][] arr = new String[17][17];
		//双层嵌套循环遍历并赋值
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				//判断第一行及第一列
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