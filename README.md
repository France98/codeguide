Code Guideline
----------------------------------------------
1.Use the variable name that easy to understand
-----------------------------------------------
You should create the name of variable that easy to understand. Variable will tell the reader what the variable represents.
For example:

```
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your name: ");
		String n = s.nextLine();
		System.out.print("My name is " + n);
	}

```
You can make your code more clear by change variable name like this:

```
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name: ");
		String name = input.nextLine();
		System.out.print("My name is " + name);
	}

```
Exercise: https://github.com/France98/codeguide/blob/master/src/codeguide/Exercise1.java

Reference: http://www.cs.utah.edu/~germain/PPS/Topics/variables.html

2.Don't repeat yourself
----------------------------------------------------------------
You should avoid the duplicate code. If you have to change the code because of bug, it will easier to find

```
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name : ");
		String name1 = scanner.nextLine();
		System.out.println(name1);
		System.out.print("Name : ");
		String name2 = scanner.nextLine();
		System.out.println(name2);
	}

```
Then you can see that the code have print 2 time. So you have to create new method to remove duplicate code

```
	public static void print(String name){
		System.out.println(name);
	}

```
Use it like this:

```
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("name :");
		String name1 = scanner.nextLine();
		print(name1);
		System.out.println("name :");
		String name2 = scanner.nextLine();
		print(name1);
	}


```
Exercise: https://github.com/France98/codeguide/blob/master/src/codeguide/Exercise2.java

Reference: https://programmingenthusiast.wordpress.com/2015/05/08/object-oriented-design-principle-dont-repeat-yourself-dry/
