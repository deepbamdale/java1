import java.util.Scanner;
public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i,n=5; //we can change limit
		
		System.out.println("even no are:");
		for(i=0;i<=n;i++)
		{if(i%2==0)
		 
			System.out.println(+i);
		}
		System.out.println("odd no are:");
		for(i=0;i<=n;i++)
		{if(i%2!=0)
		 
			System.out.println(+i);
		}

	}

}
