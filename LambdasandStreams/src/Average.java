import java.util.ArrayList;
import java.util.Scanner;

public class Average {
	private static int sums=0;
	private static void averageList(int sums ,int n)
	{
		final double avg=sums/n;
		System.out.println("Average is: "+avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: of list:");
		int size = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(size);
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the number");
			int z = sc.nextInt();
			arr.add(z);
			sums += z;
		}
		averageList(sums, size);
		sc.close();
		
	}

}
