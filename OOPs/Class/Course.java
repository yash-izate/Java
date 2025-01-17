package OOPs;

public class Course {
  static int maxCapacity = 100;
  String courseName;
  int enrollements;

  Course(String courseName) {
    this.courseName = courseName;
  }

  String[] enrolledStudents = new String[maxCapacity];

  static void maxCapacity(int maxCapacity) {
    Course.maxCapacity = maxCapacity;
  }

  void enrollStudent(String studentName) {
    if (enrollements < maxCapacity) {
      enrolledStudents[enrollements] = studentName;
      enrollements++;
    } else {
      System.out.println("Course is full. Cannot enroll more students.");
    }
  }

  void unenrollStudent(String studentName) {
    int studentIndex = -1;

    // Find the student in the array
    for (int i = 0; i < enrollements; i++) {
      if (enrolledStudents[i].equals(studentName)) {
        studentIndex = i;
        break;
      }
    }

    // If student found
    if (studentIndex != -1) {
      // Shift all elements after the student to the left
      for (int i = studentIndex; i < enrollements - 1; i++) {
        enrolledStudents[i] = enrolledStudents[i + 1];
      }
      enrolledStudents[enrollements - 1] = null; // Nullify the last element
      enrollements--;
      System.out.println("Student " + studentName + " has been removed.");
    } else {
      System.out.println("Student not found in the course.");
    }
  }

  public static void main(String[] args) {
    Course course = new Course("Java Programming");
    course.enrollStudent("Alice");
    course.enrollStudent("Bob");
    course.enrollStudent("Charlie");

    course.unenrollStudent("Bob"); // Unenroll Bob

    // Print the current students
    for (int i = 0; i < course.enrollements; i++) {
      System.out.println(course.enrolledStudents[i]);
    }
  }
}
