package test.java.remotely;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.remotely.SeatingStudents;

class SeatingStudentsTest {

  @Test
  public void seatingStudents() {
    // GIVEN
    int[] classrom1 = new int[] { 12, 2, 6, 7, 11 };
    int[] classrom2 = new int[] { 2, 1 };
    int[] classrom3 = new int[] { 10, 1, 2, 5, 6, 7 };

    // WHEN
    int count1 = SeatingStudents.seatingStudents(classrom1);
    int count2 = SeatingStudents.seatingStudents(classrom2);
    int count3 = SeatingStudents.seatingStudents(classrom3);

    // THEN
    assertEquals(6, count1);
    assertEquals(0, count2);
    assertEquals(3, count3);
  }

}