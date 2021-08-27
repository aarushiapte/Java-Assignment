package CoreJavaAsgn.question1;

interface Employee{
    void name(String n);
    void empId(int i);
}

//parent abstract class
public abstract class ques1 implements Employee{
    String name;

    @Override
    public void name(String n){

        this.name = n;
        System.out.println("Employee Name: " +name);
    }

}
//child class- EmpDetails.java