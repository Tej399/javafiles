/******************************************************************************
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
*******************************************************************************/




import java.util.scanner;
class SCANNER 
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      char gender = sc.next().charAt(0);
      int age = sc.nextInt();
    long mobileNo = sc.nextLong();
    double cgpa = sc.nextDouble();
    System.out.println("Name: "+name);
    System.out.println("Gender: "+gender);
    System.out.println("Age: "+age);
    System.out.println("Mobile Number: "+mobileNo); 
    System.out.println("CGPA: "+cgpa);;
}
}
