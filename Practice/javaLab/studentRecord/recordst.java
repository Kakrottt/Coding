package studentRecord;


public class recordst {
    private String name;
    private int Rollno;
    private int eng;
    private int hin;
    private int math;
    private int cs;

    public recordst(String n, int Rno, int eng, int hin, int math, int cs){
        this.name = n;
        this.Rollno = Rno;
        this.eng = eng;
        this.hin = hin;
        this.math = math;
        this.cs = cs;

    }

    public void display(){
        System.out.print("\n | " + this.Rollno +"\t | " + this.name + "\t | " + this.eng + "\t | " + this.hin + "\t | " + this.math + "\t | " + this.cs + "\t |");
    }

    public int sum(){
        int tsum = this.eng + this.hin + this.math;
        return tsum;
    }




}
