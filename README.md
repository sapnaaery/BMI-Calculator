BMI Calculator
A simple Java console application that calculates a person's Body Mass Index (BMI) based on their height and weight, then displays the corresponding BMI category.

📌 Project Description
This project is created using Java and demonstrates basic programming concepts such as:

User input using Scanner
Variables and data types
Arithmetic calculations
Conditional statements (if, else if, else)
Formatted output using printf
Closing the Scanner resource
🛠️ Technologies Used
Java
Java Scanner
Java Conditional Statements
📂 Project Structure
day4/
└── BMICalculator.java

🚀 How to Run
1. Clone or download the project
Download the project to your local machine.

2. Open the project
Open the project using a Java IDE such as:

IntelliJ IDEA
Eclipse
Visual Studio Code
3. Run the program
Run the BMICalculator.java file.

4. Enter your details
The program will ask for:

Enter your height in meters:
Enter your weight in kgs:

For example:

Enter your height in meters: 1.75
Enter your weight in kgs: 70

The program calculates BMI using the formula:

BMI = weight / (height × height)

📊 BMI Categories
The program uses the following BMI ranges:

BMI Range	Category
Less than 18.5	Underweight
18.5 – 24.99	Healthy Weight
25.0 – 29.99	Overweight
30.0 or above	Obese

💻 Example Output
BMI Calculator

Enter your height in meters:1.75
Enter your weight in kgs:70

Your BMI value is: 22.86

Your BMI Detailed Results as below:
Your BMI Category as per BMI range is Healthy Weight

🧠 How the Program Works
The program creates a Scanner object to accept user input.

The user enters their height in meters.

The user enters their weight in kilograms.

The BMI is calculated using:

double BMI = weight / (height * height);

The calculated BMI is displayed with two decimal places.

An if-else statement determines the BMI category.

The Scanner is closed after the calculation.

📚 Learning Objectives
By completing this project, you can practice:

Creating and running a Java program
Taking input from the user
Working with double variables
Performing mathematical calculations
Using if-else conditions
Formatting decimal output
Organizing Java code using packages and classes
