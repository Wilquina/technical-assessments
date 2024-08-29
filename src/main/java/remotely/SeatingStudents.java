package main.java.remotely;

import java.util.HashSet;
import java.util.Set;

public class SeatingStudents {

  public static int seatingStudentsArray(int[] arr) {
    // code goes here
    int totalDesks = arr[0];
    boolean[] occupied = new boolean[totalDesks + 1];
    int count = 0;

    // Flag occupied desks first
    for (int i = 1; i < arr.length; i++) {
      occupied[arr[i]] = true;
    }

    // First, we check horizontally adjacent desks for availability (1 and 2, 3 and 4, etc)
    for (int i = 1; i < totalDesks; i += 2) {
      if (!occupied[i] && !occupied[i + 1]) {
        count++;
      }
    }

    // Now we check vertically (1 and 3, 2 and 4, etc)
    for (int i = 1; i <= totalDesks - 2; i++) {
      if (!occupied[i] && !occupied[i + 2]) {
        count++;
      }
    }

    return count;
  }

  public static int seatingStudents(int[] arr) {
    // code goes here
    int totalDesks = arr[0];
    Set<Integer> occupied = new HashSet<>();
    int count = 0;

    // Flag occupied desks first
    for (int i = 1; i < arr.length; i++) {
      occupied.add(arr[i]);
    }

    // We check all desks and check adjacent pairs
    for (int i = 1; i < totalDesks; i++) {
      // Check the right pair first, checking if the desk number is odd (due to the classroom setup)
      // Check if the first odd numbered desk is occupied (for example desk 1)
      // Check if the desk right of 1 is occupied (for example i + 1 = desk 2)
      if (i % 2 != 0 && !occupied.contains(i) && !occupied.contains(i + 1)) {
        count++;
      }

      // Now we do the same for the below pair (i and i +2)
      // We make sure first i + 2 doesn't run into an IOB Exception
      if (i + 2 <= totalDesks && !occupied.contains(i) && !occupied.contains(i + 2)) {
        count++;
      }
    }

    return count;
  }

}
