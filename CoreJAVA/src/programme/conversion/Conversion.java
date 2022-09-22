package programme.conversion;

import java.text.ParseException;

public class Conversion {

	public static void main(String[] args) throws ParseException {

		System.out.println("Ways to convert different data type : \n");

		// converting string
		String str = "hello";
		char c[] = str.toCharArray();
		System.out.println(c[0]);

		System.out.println("String :");
		// System.out.println(((Object) i).getClass().getName());
		System.out.println("Integer ->  Integer.parseInt(str), Integer.valueOf(str)");
		System.out.println("Boolean ->  Boolean.parseBoolean(str), Boolean.valueOf(str)");
		System.out.println("Char    ->  str.charAt(0)");
		System.out.println("Long    ->  Long.parseLong(str)");
		System.out.println("Float   ->  Float.parseFloat(str)");
		System.out.println("Double  ->  Double.parseDouble(str)");
		System.out.println("Date    ->  new SimpleDateFormat(\"dd/MM/yyyy\").parse(str)");
		System.out.println("Object to String ->  obj.toString(), String.valueOf(obj)");

		// converting integer
		System.out.println("\nInteger :");
		System.out.println("String  ->  Integer.toString(a), String.valueOf(a)");
		System.out.println("Long    ->  new Long(i), Long.valueOf(i)");
		System.out.println("Double  ->  new Double(i), Double.valueOf(i)");
		System.out.println("int to Char    ->  (char)a");
		System.out.println("Char to int    ->  Integer.parseInt(String.valueOf(c)), Character.getNumericValue(c)");

	}

}
