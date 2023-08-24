Java Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e. it can sort the elements on the basis of single data member only.

Implement Comparator<T> from java.util.Comparator to compare custom/user-defined class object .

Example:

	public static Comparator<Employee> nameComparing = new Comparator<Employee>() {
  		@Override
		public int compare(Employee e1, Employee e2) 
	  	{
	   		return e1.getEmpName().compareTo(e2.getEmpName());
		}
	 };
