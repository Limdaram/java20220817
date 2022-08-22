package ch04.lecture;

public class C08For {
	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=1; i<6; i++) {
			for (int j=1; j<6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=1; i<6; i++) {
			for (int j=5; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=1; i<6; i++) {
			for (int j=4; j>=0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=1; i<=5; i++) {
			for (int j=0; j<(i); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i=1; i<=6; i++) {
			for (int j=1; j<(i); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		int k = 0;
		for (int i=1; i<5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=1; i<=6; i++) {
			for (int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=(6-i); j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<=5; i++) {
			// space 출력
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			// * 출력
			for (int l=5; l>i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<=5; i++) {
			for (int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for (int l=0; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		int kk = 0;
			for (int i=0; i<5; i++) {
				for (int j=0; j<=i; j++) {
					System.out.print((kk++) % 10);
				}
				System.out.println();
			}
	}
}
