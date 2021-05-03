package game.racingcar;

import java.util.Scanner;

/**
 * 유저 인터페이스
 *
 * @author ttuop
 */
class UserInterface {

	private static final Scanner SCANNER = new Scanner(System.in);

	static String receive() {
		return SCANNER.nextLine();
	}

	static void send(String message) {
		System.out.println(message);
	}

	static void shutdown() {
		SCANNER.close();
	}

}
