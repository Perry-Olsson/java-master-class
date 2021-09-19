public class Main {
  public static void main(String[] args) {
    System.out.println(calcFeetAndInchesToCentimeters(6, 0));
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet < 0 || inches < 0 || inches > 12)
      return -1;
    double inchToCentimeter = 2.54d;
    double totalInches = feet * 12 + inches;
    return totalInches * inchToCentimeter;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches < 0)
      return -1;
    int feet = (int)(inches / 12);
    double remainingInches = inches % 12;
    System.out.println(feet);
    return calcFeetAndInchesToCentimeters(feet, remainingInches);
  }
}
