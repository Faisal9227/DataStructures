import java.util.Scanner;

public class Sumoftwocubeslessthann {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		find(a);
	}

	private static void find(int a) {
		// TODO Auto-generated method stub
		int j=(int) Math.cbrt(a);
		int i=0;
		do{
			int sum=(i*i*i)+(j*j*j);
			if(sum>a)
				j--;
			else if(sum<a)
				{
				i++;
				System.out.println(i+"---"+j+"----"+sum);
				}
		}while(i<=j);
	}
	
}
