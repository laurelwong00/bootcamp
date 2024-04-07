
/**
 * Input: arrivalTime = 15, delayedTime = 5
 * Output: 20 
 * Explanation: Reach at 15+5 = 20 (20:00).
 *
 */
import java.util.Scanner;

public class JavaQuest11 {
  // You are given a positive integer arrivalTime denoting the arrival time of a
  // train in hours,
  // and another positive integer delayedTime denoting the amount of delay in
  // hours.
  // Calculate Delayed Arrival Time

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter arrival time:");
    int arrivalTime = input.nextInt();
    System.out.println("enter delayed time:");
    int delayedTime = input.nextInt();
    int result = findDelayedArrivalTime(arrivalTime, delayedTime);
    System.out.println("delayed Arrival time: " + result);
  }


  public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

    int delayedArrivalTime = arrivalTime + delayedTime;
    if ((delayedArrivalTime) >= 24) {
      return (delayedArrivalTime - 24);
    }
    return delayedArrivalTime;
  }
}