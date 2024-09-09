package day8;

	import java.util.Scanner;

	public class Quiz {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[] questions = { "1) 5+2=?", "2) what is javac?", "3) How many primitive datatype in java?",
					"4) Choose which one is primitive ", "5) Find Addition opertor?", "6) JVM is platform independant" };
			String[][] options = { { "A.2", "B.1", "C.7", "D.10" },
					{ "A.Compiler", "B.interpreter", "C.language", "D.controler" }, { "A.4", "B.8", "C.12", "D.10" },
					{ "A.object", "B.String", "C.Character", "D.int" }, { "A.++", "B.+=", "C.+", "D.*" },
					{ "A.true", "B.false" } };
			String[] ansKey = { "C", "A", "B", "D", "C", "A" };
			int score = 0;
			for (int i = 0; i < questions.length; i++) {
				System.out.println(questions[i]);
				for (int j = 0; j < options[i].length; j++) {
					System.out.println(options[i][j]);

				}
				System.out.println("Enter your Answer:");
				String ans = sc.next();
				if (ansKey[i].equals(ans)) {
					score++;
					System.out.println("Correct Answer!!!");

				} else {
					System.out.println("Wrong Anwser");
				}
			}
			System.out.println(
					"Your Score is " + score + " out of" + ansKey.length + "\n Percentage " + score * 100 / ansKey.length);
		}

	}



