package encapsulation;

public class Employee {


	
	public static void main(String[] args)
	{{
		// TODO Auto-generated method stub
     Ques2 myObject = new Ques2();
     myObject.setId(24500653);
     myObject.setFirstName("Nishanth");
     myObject.setLastName("G ");
     myObject.setSalary(45000);
	 myObject.setGrossSalary(45000*12);
	 myObject.setRevisedSalary((45000*12*0.15)+(45000*12));
	    
	 
	 System.out.println(myObject.getId(  ));
	 System.out.println(myObject.getLastName() + myObject.getFirstName());
	 System.out.println(myObject.getSalary());
     System.out.println(myObject.getGrossSalary());
     System.out.println(myObject.getRevisedSalary());
     
	 
	 
}
	 
	}

}
