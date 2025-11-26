package com.practise;

public class Aggregation {

		String name;
		String id;
		Aggregation1 ag1;
		
		public Aggregation(String Name, String Id, Aggregation1 ag){
			this.name = Name;
			this.id = Id;
			this.ag1 = ag;
		}

		void display(){
			System.out.println("EmployeeMphasis Details: ");
			System.out.println("Name: "+name);
			System.out.println("ID: "+id);
			System.out.println("City: "+ag1.City);
			System.out.println("State: "+ag1.State);
		}
	
	public static void main(String[] args) {
		Aggregation1 add=new Aggregation1("gzb","UP"); 
		Aggregation ag = new Aggregation("alok", "01", add);
		ag.display();
	}

}
