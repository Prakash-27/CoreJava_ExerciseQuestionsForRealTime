package com.loops;

public class allLoopsconcepts {

	public static void main(String[] args) {

		//DoWhileTest1 
//		do {
//            System.out.println(100);
//        } while (true);
//        System.out.println("Bye");
       
		
		// DoWhileTest2
//		do {
//			System.out.println(100);
//		} while (false);
//		System.out.println("Bye");

		// DoWhileTest3
		int start = 1;
		int sum = 0;
		do {
			if (start % 2 == 0) {
				continue;
			}
			sum += start;
		} while (++start <= 10);
		System.out.println(sum);

		// ForLoop3
		forloop: for (int i = 2; i <= 100; i = i + 2) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
			if (i == 10) {
				break forloop;
			}
		}

		// NestedLoops1
		int i;
		outer: do {
			i = 5;
			inner: while (true) {
				System.out.println(i--);
				if (i == 4) {
					break outer;
				}
			}
		} while (true);

		// WhileTest3
		int x = 5;
		while (x < 10)
			System.out.println(x);
		x++;

		// DoWhileTest1
		do {
			System.out.println(100);
		} while (true);

		// Which of the following statement is correct?
		// DoWhileTest2

//		do {
//            System.out.println(100);
//        } while (false);
//        System.out.println("Bye");

	}

}