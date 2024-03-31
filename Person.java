import java.time.*;


class Person extends Employee
{  
    public static void main(String[] args)
    { 
        float emp_id = 1234;
        float emp_salary = 50000;


        LocalDate pdt = LocalDate.of(2004,02,13);
        LocalDate tdt = LocalDate.now();
        Period diff = Period.between(pdt, tdt);
        System.out.println("Name: Sahishnu");
        System.out.println("Date of Birth : "+pdt);
        System.out.println("Age : "+diff.getYears());
        System.out.println("Emp_id : "+emp_id(emp_id));
        System.out.println("Emp_salary : "+emp_salary(emp_salary)); 
    }
}


class Employee{
    static float emp_id (float x){
        return x;
    }
    static float emp_salary (float y){
        return y;
    }
    
}
