package by.home.maxzzzit;

import java.util.Scanner;

public class DlinaStroki {
	public static void main(String[]args) {
		Scanner chit = new Scanner(System.in);
		System.out.print("Введите строку: ");
		String str;
		int i;
		str=chit.nextLine();
		i=str.length();
		System.out.println("Количество символов в строке: "+i);
	}
}
