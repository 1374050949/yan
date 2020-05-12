/*
	自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。 
 */
import java.util.Scanner;

public class KuoRongTest{

    public static void main(String[] args){
    	
		//自定义数组的容量并创建
    	System.out.println("请输入数组的容量：");
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int[] arr = new int[num];
		//循环对数组进行赋值，并控制在百分之80
    	int i = 0;
    	while (i < (arr.length-1)*0.8){
    		System.out.println("请输入第"+(i+1)+"个数");
    		arr[i] = sc.nextInt();
    		i++;
    		
    	}
		//超过创建新的数组进行扩容，以及将原数组的值进行赋值
    	int[] brr = new int[new Double(num*1.5).intValue()];
    	System.arraycopy(arr,0,brr,0,(i-1));
    	System.out.println(brr.length);
    }

}