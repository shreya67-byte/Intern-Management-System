import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Declare Scanner

        Intern intern = new Intern();

        System.out.println("Enter Intern ID:");
        intern.setInternId(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter Name:");
        intern.setName(sc.nextLine());

        System.out.println("Enter Email:");
        intern.setEmail(sc.nextLine());

        System.out.println("Enter Department:");
        intern.setDepartment(sc.nextLine());

        System.out.println("Enter Mentor:");
        intern.setMentor(sc.nextLine());

        System.out.println("Enter Project Title:");
        intern.setProjectTitle(sc.nextLine());

        System.out.println("Enter Feedback:");
        intern.setFeedback(sc.nextLine());

        InternDAO dao = new InternDAO();
        boolean success = dao.insertIntern(intern);

        if (success) {
            System.out.println("Intern data inserted successfully.");
        } else {
            System.out.println("Failed to insert intern data.");
        }

        sc.close(); // ✅ Close the scanner to fix the warning
    }
}
