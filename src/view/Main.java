package view;

import java.util.Random;

import command.ThreadControl;

public class Main {

	public static void main(String[] args) {

		Random r = new Random();

		Thread first_t = new ThreadControl(r.nextInt(50), 100);
		Thread second_t = new ThreadControl(r.nextInt(50), 300);
		Thread third_t = new ThreadControl(r.nextInt(50), 500);
		Thread forth_t = new ThreadControl(r.nextInt(50), 700);
		Thread five_t = new ThreadControl(r.nextInt(50), 1000);

	}

}
