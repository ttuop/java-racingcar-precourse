package game.racingcar;

import java.util.Scanner;

/**
 * 유저 인터페이스
 *
 * @author ttuop
 */
public class UserInterface {

	private static final Scanner SCANNER = new Scanner(System.in);

	public static String receive() {
		return SCANNER.nextLine();
	}

	public static void send(String message) {
		System.out.println(message);
	}

	public static void shutdown() {
		SCANNER.close();
	}

}
