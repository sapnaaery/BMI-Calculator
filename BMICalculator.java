package day4;

import java.util.Scanner;

public class BMICalculator {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("BMI Calculator");

			System.out.print("Enter your height in meters:");
			double height = scanner.nextDouble();

			System.out.print("Enter your weight in kgs:");
			double weight = scanner.nextDouble();

			double BMI = weight / (height * height);
			System.out.printf("\nYour BMI value is: %.2f\n", BMI);

			System.out.println("Your BMI Detailed Results as below:");

			if (BMI < 18.5) {
				System.out.println("Your BMI Category as per BMI range is Underweight");
			}

			else if (BMI >= 18.5 && BMI < 25) {
				System.out.println("Your BMI Category as per BMI range is Healthy Weight");
			} else if (BMI >= 25.0 && BMI < 30) {
				System.out.println("Your BMI Category as per BMI range is OverWeight");
			} else {
				System.out.println("Your BMI Category as per BMI range is Obese");
			}

			scanner.close();

		}

	}

