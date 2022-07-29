package baekjoon;

import java.util.Scanner;

public class Main {
	
	// 알람 시계
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
	// 사분면 고르기
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
	
	// 윤년
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
	
	// 시험 성적
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
	
	// 두 수 비교하기
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
	
	// 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
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
	
	// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) ×(B%C))%C를 출력한다.
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
	
	//불기 연도를 서기 연도로 변환한 결과를 출력한다.
	public static void j18108() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(a-543);
		sc.close();
	}
	
	//출력 첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
	public static void j10926() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(s+"??!");
		sc.close();
	}
	
	//두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
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
	
	//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
	public static void j1008() {
		Scanner sc = new Scanner(System.in);
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		System.out.println(a/b);
	}
	
	//두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
	public static void j10998() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a*b);
	}
	
	//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	public static void j1000() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
	}

	//개를 출력한다.
	public static void j10172() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	
	//고양이를 출력한다.
	public static void j10171() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( \')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	
	//두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
	public static void j10718() {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}
	
	//Hello World!를 출력하시오.
	public static void j2557() {
		System.out.println("Hello World!");
	}
*/