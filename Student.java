package poorvatutorial;

public class Student {

	int id;
	String name;
	String gender;
    int phone;
    
     Student()
    {
    	id = 12;
    	name = "poorva";
    	gender = "female";
    	phone = 123;
    	System.out.println("Creating a student");
    }
     
//     Student(int id1, String name1, String gender1, int phone1)
//     {
//    	 id = id1;
//    	 name = name1;
//    	 gender = gender1;
//    	 phone = phone1;
//    	 System.out.println("Creating parameter student");
//     }
     public void PrintMethod(int id2)
     {
    	 id = id2;
    	 System.out.println(id);
     }
    
}
