package finalss;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
			System.out.println("Please enter n:");
			Scanner scan = new Scanner(System.in);
			int n  = scan.nextInt();
			System.out.println("U("+n+")= "+sequence(n));
			System.out.println("Please enter k: ");
			int k = scan.nextInt();
			display(k);
			
		}

		public static int sequence(int k) {
			if (k == 1)
				return 1;
			if (k == 2)
				return 2;
			if(k==3)
				return 3;
			if (sequence(k - 2) % 2 == 0)
				return 2 * sequence(k - 2) + 1;
			else
				return sequence(k-3)+2 * sequence(k - 2)-sequence(k-1);
		}

		public static void display(int k) {
			int count = 0;
			System.out.println("The first "+k+" values of n having U(n) odd:");
			int w = k;
			while(w!=0) {
			for (int i = 1; i <= 1000; i++) {
				boolean flag = false;
				if(sequence(i)%2!=0) {
					flag = true;
					System.out.println("n= "+i+" since U("+i+") = "+sequence(i));
					count+=1;
					w--;
					if(flag==true&&count==k) {
						break;
					}
				}
			}
				}
			}
		}
