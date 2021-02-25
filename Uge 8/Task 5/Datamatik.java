class Datamatik
{
	public static void main(String [] args)
	{
		Student[] students = new Student[10];

		students[0] = new Student("Philippe", 25, false, "Group E");
		students[1] = new Student("Angeliza",25, true, "Group random");
		students[2] = new Student("Weinell", 22, false, "Group Random1");
		students[3] = new Student("Galler", 23, false,  "Group Random5");
		students[4] = new Student("Bjarke",25, false, "Group E");
		students[5] = new Student("Oliver", 22, false, "Group E");
		students[6] = new Student("Jantie", 21, true, "Group E");
		students[7] = new Student("Weinell", 22, false, "Group Random1");
		students[8] = new Student("Christian Cleve", 24, false, "Group Random2");
		students[9] = new Student("Asger", 19, false,  "Group Random3");
		
		

		studentNames(students,1);
		studentNames(students,3);
		studentNames(students,0);
		findName(students, "Angeliza");
		findName(students, "Galler");
		findName(students, "Philippe");

	}

	public static String studentNames (Student[] students, Integer index)
	{
		System.out.println(students[index].name);
		return students[index].name;	
	}

	public static String findName (Student[] students, String name)
	{
		for (int i = 0; i<students.length; i++)
		{
			if(students[i].name.contains(name))
			{
				System.out.println("Here is the student!");
				System.out.println(students[i].name);
				System.out.println(""+students[i].name+"'s index is: "+i+".");
			}
		}	
		return name;
	}
}

