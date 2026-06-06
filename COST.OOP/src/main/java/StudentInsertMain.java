public class StudentInsertMain {
    public static void main(String[] args) {
        Student student = new Student(1, "Nimal Perera", 82);

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.addStudent(student);
    }
}