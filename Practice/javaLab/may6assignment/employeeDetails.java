package javaLab.may6assignment;

public class employeeDetails {
    private String Lname;
    private String Fname;
    private int idno;
    // private double pno;
    // private String email;

    public employeeDetails(String Lname, String Fname, int idno){
        this.Lname = Lname;
        this.Fname = Fname;
        this.idno = idno;
        // this.pno = pno;
        // this.email = email;
    }

    public void prnt(){
        System.out.println("| " + Fname + " | " + Lname + " | " + idno + " |");
    }

}