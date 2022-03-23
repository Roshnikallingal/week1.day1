package week1.day1.assignment;

public class primeNumber {
	
	public static void main(String[] args) {
		 
		int num=0;
		int n=13;
		num=n/2;
		boolean flag = false;
		for(int i=2;i<=num;i++) {
			if(n%i==0)
			{
				System.out.println("not Prime");
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println(n + ""+"is prime");
		}
	}

}
