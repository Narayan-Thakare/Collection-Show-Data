package show;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Student {

	int roll;
	String name;
	String address;
	Student(int roll,String name,String address){
		
		this.roll=roll;
		this.name=name;
		this.address=address;
		
		
		
	}
	
	public int getRoll(){
		
		return roll;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String toString(){
		
		return roll+" "+name+" "+address;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s= new Scanner(System.in);
		Collection<Student>c=new ArrayList<Student>();
		boolean loop=true;
		
		
		while(loop){
			 System.out.println("1.Add Student");
			 System.out.println("2.Show Student");
			 System.out.println("3.Exit");
			 System.out.println("Enter the choice");
			 int choice =Integer.parseInt(s.nextLine());
			 
			 switch(choice){
			 
			 case 1:
				 System.out.println("Enter the no. of Student");
				 int n=Integer.parseInt(s.nextLine());
				 for(int i=0;i<n;i++){
				 System.out.println(i+1+":Enter the roll No.");
				int roll=Integer.parseInt(s.nextLine());
				 System.out.println("Enter the name");
				 String name=s.nextLine();
				 System.out.println("Enter the Address");
				 String address=s.nextLine();
				 c.add(new Student(roll,name,address));
 				 System.out.println("Data insert..... ");
 				 
				 }
				 break;
			 
			 case 2:
				  Iterator<Student>i=c.iterator();
				  while(i.hasNext()){
					  Student st=i.next();
					  System.out.println(st);
					  
				  }
				 
				 break;
			 
			 case 3:
				 loop=false;
				 System.out.println("Exit");
				 
				 break;
			 
			 default:
			 System.out.println("Wromg choice");
			 break;
			 
			 }
			 
 			
			
			
			
			
			
			
			
			
		}

		
		
		
		
		
		
		
		
	}

}
