package CoreJavaAsgn.question1;

public class EmpDetails extends ques1 {
    int id;

    @Override
    public void empId(int i){
        this.id = i;
        System.out.println("Employee Id: " +id);
    }

    public static void main(String args[]){
        EmpDetails emp = new EmpDetails();
        emp.empId(273);
        emp.name("Aarushi");
    }

    
}
