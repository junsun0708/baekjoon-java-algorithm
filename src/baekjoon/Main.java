package baekjoon;

import java.util.Scanner;

public class Main {
	
	// �˶� �ð�
	public static void j2884() {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		String[] b = a.split(" ");
		int c = (Integer.parseInt(b[0]) == 0 ? 24 : Integer.parseInt(b[0])) * 60 + Integer.parseInt(b[1]) - 45;
		System.out.println(c / 60 + " " + c % 60);
		sc.close();
	}

	public static void main(String[] args) {
		j2884();
	}
}


/*
	// ��и� ����
	public static void j14681() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > 0) {
			if (y > 0) {
				System.out.println("1");
			} else {
				System.out.println("4");
			}
		} else {
			if (y > 0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}
		sc.close();
	}
	
	// ����
	public static void j2753() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		sc.close();
	}
	
	// ���� ����
	public static void j9498() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (90 <= a && a <= 100) {
			System.out.println("A");
		} else if (80 <= a && a <= 89) {
			System.out.println("B");
		} else if (70 <= a && a <= 79) {
			System.out.println("C");
		} else if (60 <= a && a <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		sc.close();
	}
	
	// �� �� ���ϱ�
	public static void j1330() {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		String[] b = a.split(" ");
		if (Integer.valueOf(b[0]) > Integer.valueOf(b[1])) {
			System.out.println(">");
		} else if (Integer.valueOf(b[0]) < Integer.valueOf(b[1])) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		sc.close();
	}
	
	// ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ����Ѵ�.
	public static void j2588() {
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B = 0;
		A = sc.nextInt();
		B = sc.nextInt();

		System.out.println(A*(B%10));
		System.out.println(A*(B/10%10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
		sc.close();
	}
	
	// ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) ��(B%C))%C�� ����Ѵ�.
	public static void j10430() {
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int C = 0;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
		sc.close();
	}
	
	//�ұ� ������ ���� ������ ��ȯ�� ����� ����Ѵ�.
	public static void j18108() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(a-543);
		sc.close();
	}
	
	//��� ù° �ٿ� ������ ����� ����Ѵ�. ����� ���̵� �ڿ� ??!�� �ٿ��� ��Ÿ����.
	public static void j10926() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(s+"??!");
		sc.close();
	}
	
	//�� �ڿ��� A�� B�� �־�����. �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	public static void j10869() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		sc.close();
	}
	
	//�� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void j1008() {
		Scanner sc = new Scanner(System.in);
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		System.out.println(a/b);
	}
	
	//�� ���� A�� B�� �Է¹��� ����, A��B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void j10998() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a*b);
	}
	
	//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void j1000() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
	}

	//���� ����Ѵ�.
	public static void j10172() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	
	//����̸� ����Ѵ�.
	public static void j10171() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( \')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	
	//�� �ٿ� ���� "����ģ�� ��������"�� �� �ٿ� �� ���� ����Ѵ�.
	public static void j10718() {
		System.out.println("����ģ�� ��������");
		System.out.println("����ģ�� ��������");
	}
	
	//Hello World!�� ����Ͻÿ�.
	public static void j2557() {
		System.out.println("Hello World!");
	}
*/