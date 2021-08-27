package CoreJavaAsgn;

class EmployeeEncapsulation {
	
	private String name;
	private int id;
	private int deptId;

	public String getName() {
         return name; 
    }

	public int getId() { 
        return id; 
    }

    public int getDeptId() { 
        return deptId; 
    }

    public void setName(String empName){
		name = empName;
	}

	
	public void setDeptId(int empId) {
         id = empId; 
    }

    public void setId(int empDeptId) {
        deptId = empDeptId; 
   }

}

public class ques2 {
	public static void main(String[] args)
	{
		EmployeeEncapsulation e = new EmployeeEncapsulation();

		e.setName("Aarushi");
		e.setId(101);
		e.setDeptId(800);

		System.out.println("Name: " + e.getName());
		System.out.println("ID: " + e.getId());
		System.out.println("Dept ID: " + e.getDeptId());

		
	}
}
