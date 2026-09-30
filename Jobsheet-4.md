# WORKSHEET 4 - SELECTION 1

**Student Details:**

- **Name:** Farrosyehan Muhammad Ramdhan
- **Student ID (NIM):** 264107020186
- **Class / Attendance No.:** 1I / 10

---

## 1: PRACTICAL OBJECTIVES

The objectives of the practical session in this chapter are as follows:

1. Students will be able to understand the basic concepts of selection structures (conditional statements).
2. Students will be able to implement `if`, `if-else`, and `switch-case` statements in Java.
3. Students will be able to analyze the execution flow of branching logic.

---

## 2: Experimental Results & Analysis

### 2.1 Experiment 1: Using IF and IF-ELSE to Print the KRS

At the beginning of every semester, students must print their KRS (Study Plan Card) so it
can be signed by their Academic Advisor (DPA). SIAKAD will check the student's UKT (tuition fee) payment status. If the student has fully paid the UKT, the system shows the KRS so it can be printed.

#### 2.1.1 Java Program Code

```java

import java.util.Scanner;

public class SelectionIf11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Print KRS SIAKAD");
        System.out.print("Has the UKT been paid? (true/false): ");
        boolean uktPaid = sc.nextBoolean();

        if (uktPaid) {
            System.out.println("UKT payment verified");
            System.out.println("Please print your KRS and ask your DPA to sign it");
        }
        sc.close();
    }
}

```

#### 2.1.2 Screenshot Output

The following shows the _output_ after the program is run:

![ Output Experiment 1](/result-1.png)

#### 2.1.3 Answers to Questions

- **Question 1:** What value must you enter so that both lines inside the `IF` block are printed? Explain why only that value is accepted!
  - **Answer:** You must enter the value of `true` (or any case-insensitive variation like TRUE/True). the variable uktPaid is declared as boolean. the if (uktPaid) statement evaluates whether this condition is `true`. The program will only enter the if block and execute the statement inside `if` block when expression evaluates to `true`.

- **Question 2:** Run the program, then enter false. Which lines are printed and which lines are not? Explain the execution flow when the IF condition is false!
  - **Answer:**
    - **Codes Printed:**
      ```text
      --- Print KRS SIAKAD ---
      Has the UKT been paid? (true/false): false
      ```
    - **Codes Not Printed:**
      ```text
      UKT payment verified
      Please print your KRS and ask your DPA to sign it
      ```
    - **Explanation:** When `false` is entered, `uktPaid` is assigned the `false` value. The condition `if (uktPaid)` evaluates to `false`, causing the program to skip the entire code block enclosed within the curly braces `{}` and terminate normally.

- **Question 3:** Run the program, then enter `TRUE` (in capital letters) and `yes`. What happens with each input? If the program stops with an error, explain the cause!
  - **Answer:** If the input is `TRUE`, the system will be read the same as `true` because Java's `sc.nextBoolean()` method uses a case-insensitive pattern to recognize boolean tokens. Therefore, `TRUE` is successfully accepted, converted into the boolean value `true`, and the program executes normally, printing both lines inside the `if` block. `if` the input is `yes`, the system cannot be parsed as a valid boolean value (`true` or `false`). This causes the `sc.nextBoolean()` method to throw a `java.util.InputMismatchException`, and the program abruptly stops/crashes with an error.

- **Question 4:** The system needs to give information when the user enters the value false, with the output “Registration rejected. Please pay your UKT first”. Modify the program by adding an ELSE structure, then show the run results for the inputs true and false!
  - **Answer:**
    - **Codes:**

      ```java
      import java.util.Scanner;

      public class SelectionIf11 {
          public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.println("--- Print KRS SIAKAD");
              System.out.print("Has the UKT been paid? (true/false): ");
              boolean uktPaid = sc.nextBoolean();

              if (uktPaid) {
                  System.out.println("UKT payment verified");
                  System.out.println("Please print your KRS and ask your DPA to sign it");
              } else {
                  System.out.println("Registration rejected");
                  System.out.println("Please pay your UKT first");
              }
              sc.close();
          }
      }
      ```

    - **Input true:**
      ```text
      UKT payment verified
      Please print your KRS and ask your DPA to sign it
      ```
    - **Input false:**
      ```text
      Registration Rejected
      Please pay your UKT first
      ```

---

### 2.2 Experiment 2: SWITCH-CASE to Print the KRS

At the beginning of every semester, students must print their KRS so it can be signed by
their Academic Advisor (DPA). The SIAKAD system will check the student's current semester, then show the KRS for that semester so it can be printed.

#### 2.2.1 Java Program Code

```java

import java.util.Scanner;;

public class SelectionSwitch11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Enter your current semester: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS for Semester 1 is displayed");
                break;
            case 2:
                System.out.println("KRS for Semester 2 is displayed");
                break;
            case 3:
                System.out.println("KRS for Semester 3 is displayed");
                break;
            case 4:
                System.out.println("KRS for Semester 4 is displayed");
                break;
            case 5:
                System.out.println("KRS for Semester 5 is displayed");
                break;
            case 6:
                System.out.println("KRS for Semester 6 is displayed");
                break;
            case 7:
                System.out.println("KRS for Semester 7 is displayed");
                break;
            case 8:
                System.out.println("KRS for Semester 8 is displayed");
                break;
            default:
                System.out.println("Invalid Semester");
                break;
        }
        sc.close();
    }
}
```

#### 2.2.2 Screenshot Output

The following shows the _output_ after the program is run:

![Output Experiment 2](/result-2.png)

#### 2.2.3 Answers to Questions

- **Question 1:** Delete the break; statement in case 5, then compile and run the program again with the input 5. Write down the output, then explain the function of break in the SWITCH-CASE structure based on your experiment! Put the code back to how it was when you are done.
  - **Answer:**
    - **Result:**
      ```text
      --- Print KRS SIAKAD ---
      Enter your current semester: 5
      KRS for Semester 5 is displayed
      KRS for Semester 6 is displayed
      ```
    - **Explanation:** If the `break` statement is removed from the line of code, the program will experience "fall-through"—meaning it sequentially executes the commands in the subsequent case without checking if the condition matches the input, continuing until it encounters another `break` statement.
- **Question 2:** Run the program with the input 10, then with the input 0. What is the output of these two runs? Based on the results, explain the role of default and what will happen to the program if the default part is deleted!
  - **Answer:**
    - **Result:**
      - **Input 10:**

      ```text
      --- Print KRS SIAKAD ---
      Enter your current semester: 10
      Invalid semester
      ```

      - **Input 0:**

      ```text
      --- Print KRS SIAKAD ---
      Enter your current semester: 0
      Invalid semester
      ```

    - **Explanation:** The `default` keyword acts as a fallback handler that executes if the user-supplied variable value does not match any of the defined `case` options. If `default` is removed, the program will still compile and run; however, when a value not included in the `case` statements (such as 10 or 0) is entered, the `switch` block will produce no output, and execution will proceed directly to the line of code following the `switch` block.

- **Question 3:** Change the data type of the semester variable to double, then compile the program.
Does the program compile successfully? Write down the error message and explain its
cause. List the data types that can be used as the expression in a switch! must be exactly the same as the SWITCH-CASE version, including for invalid input. In your opinion, which one is easier to read for this case, and why?
  - **Answer:** 
    - **Explanation** No, because the program will encounter a compilation error. The `double` (and `float`) data type is not permitted as a selector expression in a Java `switch` structure. This is due to the nature of binary floating-point numbers, which are prone to imprecision when comparing values ​​for exact equality.
    - **List Data Types:**
      - Primitive data types : `byte` , `short` , `char` , `int`
      - Wrapper class : `Byte` , `Short` , `Character` , `Integer`
      - String data types : `String`
      - Enum : `Enum`

- **Question 4:** Create a new file named SelectionIfElse11.java. Convert the KRS printing program that uses SWITCH-CASE into an IF - ELSE IF - ELSE form. The program output must be exactly the same as the SWITCH-CASE version, including for invalid input. In your opinion, which one is easier to read for this case, and why?
  - **Answer:**
    - **Codes:**
      ```java
         import java.util.Scanner;

         public class SelectionIf11 {
           public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
                 System.out.println("--- Print KRS SIAKAD ---");
                 System.out.print("Enter your current semester: ");
                 int semester = sc.nextInt();

         if (semester == 1) {
             System.out.println("KRS for Semester 1 is displayed");
         } else if (semester == 2) {
             System.out.println("KRS for Semester 2 is displayed");
         } else if (semester == 3) {
            System.out.println("KRS for Semester 3 is displayed");
         } else if (semester == 4) {
            System.out.println("KRS for Semester 4 is displayed");
         } else if (semester == 5) {
            System.out.println("KRS for Semester 5 is displayed");
         } else if (semester == 6) {
            System.out.println("KRS for Semester 6 is displayed");
         } else if (semester == 7) {
            System.out.println("KRS for Semester 7 is displayed");
         } else if (semester == 8) {
            System.out.println("KRS for Semester 8 is displayed");
         } else {
            System.out.println("Invalid semester");
         }
            
        } sc.close();
      }
      ```
    - **Explanation:** `SWITCH-CASE`. This is because `SWITCH-CASE` is easier to read and can identify the matching condition without repeating syntax when checking for specific, discrete values.



## 3: INDIVIDUAL ASSIGNMENT

The following is a list of tasks to be completed in this worksheet:

- [x] **Task 1:** Convert an `if-else` structure into a _Ternary Operator_.
- [x] **Task 2:** Create a program based on the _Flowchart_ for determining credit hours (SKS).
- [x] **Task 3:** Implement a parking and queuing case study.

### 3.1 Implementation of Task 1 Code

```java
import java.util.Scanner;

public class Assignment1Selection11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Print KRS SIAKAD");
        System.out.print("Has the UKT been paid? (true/false): ");
        boolean uktPaid = sc.nextBoolean();

        String msg = (uktPaid) ? "UKT payment verified" : "Pay the UKT first";
        System.out.println(msg);

        sc.close();
    }
}
```

### 3.2 Implementation of Task 2 Code

```java
import java.util.Scanner;;

public class Assignment2Selection11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCredits;

        System.out.print("Enter Total Credits: ");
        totalCredits = sc.nextInt();

        if (totalCredits > 24) {
            System.out.println("Exceeds the limit");
        } else {
            System.out.println("KRS is Valid");
        }

        sc.close();
    }
}
```

### 3.3 Implementation of Task 3 Parking System Study Case Code

```java
import java.util.Scanner;

public class AssignmentParking11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vehicle;

        System.out.print("Enter Vehicle Type: ");
        vehicle = sc.nextInt();
        if (vehicle == 4) {
            System.out.println("Car Parking fee Rp.5.000");
        } else if (vehicle == 2) {
            System.out.println("Motorcycle Parking fee Rp.3.000");
        } else if (vehicle == 3) {
            System.out.println("Bicycle Parking fee Rp.2.000");
        } else {
            System.out.println("Unknown vehicle type");
        }

        sc.close();
    }
}

```

### 3.4 Implementation of Task 3 Academic Queue Machine Study Case Code

```java
import java.util.Scanner;

public class AssignmentQueue11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Academic Queue Machine ---");
        System.out.println("1. KRS Validation");
        System.out.println("2. Academic Consultation");
        System.out.println("3. Transcript Request");
        System.out.println("4. Graduation Registration");
        System.out.println("Enter service code (1-4)");
        int serviceCode = sc.nextInt();


        switch (serviceCode) {
            case 1:
                System.out.println("Service Selected: KRS Validation");
                break;
            case 2:
                System.out.println("Service Selected: Academic Consultation");
                break;
            case 3:
                System.out.println("Service Selected: Transcript Request");
                break;
            case 4:
                System.out.println("Service Selected: Graduation Registration");
                break;
            default:
                System.out.println("Service code is not available");
                break;
        }

        sc.close();
    }
}
```

---

## 4: CONCLUSION

The `IF` statement is used when only a single condition needs to be checked and no alternative action is required if the condition evaluates to `FALSE`. The `IF-ELSE` structure is used when there are two distinct, mutually exclusive courses of action. The `SWITCH-CASE` structure is used to compare a single variable against multiple specific or discrete values. In short, selection structures are essential for managing program flow based on variables or user-defined choices.
