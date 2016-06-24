import java.util.Scanner;

public class TwoSetswhoseCubeIsSame {

	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		for(int i=a;i>=0;i--){
			find_pair(i);
		}
	}

	private static void find_pair(int a) {
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
				}
			else if(sum==a && i!=0){
				System.out.println(Math.cbrt(a)+"---"+i+"---"+j+"----"+sum);
				i++;
				j--;
			}
		}while(i<=j);
	}
	
}
