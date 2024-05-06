public class TestProgram {
    public static void main(String[] args) {
       
        Student student = new Student("Jhoanna Lacorte");

        LibraryResource book = new Book("Introduction to Object Oriented Programming");
        student.borrowResource(book);
        System.err.println();
        
        LibraryResource thesis = new Thesis("Design Patterns in Object Oriented Programming");
        student.borrowResource(thesis);
        System.err.println();
        LibraryResource capstone = new Capstone("Building a Java Application Using OOP Principles");
        student.borrowResource(capstone);
        System.err.println();
        LibraryResource internetAccess = new InternetAccess("NEU Admin");
        student.borrowResource(internetAccess);
        System.err.println();
        LibraryResource journal = new Journal("Research Journal");
        student.borrowResource(journal);
        System.err.println();
        LibraryResource newspaper = new Newspaper("RAPPLER PH");
        student.borrowResource(newspaper);
    }
}