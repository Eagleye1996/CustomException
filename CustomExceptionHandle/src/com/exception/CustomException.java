package com.exception;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {

		final double balanceAmount = 50000.00;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw amount :: ");

		double withdrawAmount = sc.nextDouble();

		try {
			if (balanceAmount < withdrawAmount) {
				String msg = "you do not have sufficient balance to withdraw " + withdrawAmount
						+ "  your account Balance is " + balanceAmount;
				throw new UserDefinedException(msg);
			} else {
				double balance = balanceAmount - withdrawAmount;
				System.out.println("Amount withdraw successful :: " + withdrawAmount + "\nYour Available balance    :: "
						+ balance);

			}
		} catch (UserDefinedException e) {

		}

	}

}
