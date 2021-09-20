public class Main {
  public static void main(String[] args) {
    System.out.println(getDurationString(4000));
  }

  //Seconds and Minutes challenge
  public static String getDurationString(int seconds) {
    if (seconds < 0)
      return "Invalid value";
    int minutes = seconds / 60;
    int remainingSeconds = seconds % 60;
    return getDurationString(minutes, remainingSeconds);
  }

  public static String getDurationString(int minutes, int seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59)
      return "Invalid value";
    int hours = minutes / 60;
    int remainingMinutes = minutes % 60;
    return getTimeStr(hours) + "h " + getTimeStr(remainingMinutes) + "m " + getTimeStr(seconds) + "s";
  }

  private static String getTimeStr(int timeVal) {
    return timeVal < 10 ? "0" + timeVal : String.valueOf(timeVal);
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
