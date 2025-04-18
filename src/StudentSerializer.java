import java.io.*;

public class StudentSerializer {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 3.8);

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))) {
            oos.writeObject(student);
            System.out.println("Student details saved successfully!\n");
        } catch (IOException e) {
            System.out.println("Error saving student: " + e);
        }

        // Deserialize
        System.out.println("Reading from file...");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {
            Student s = (Student) ois.readObject();
            s.displayDetails();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading student: " + e);
        }
    }
}
