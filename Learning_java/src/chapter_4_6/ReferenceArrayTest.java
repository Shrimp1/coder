package chapter_4_6;

public class ReferenceArrayTest {
	public static void main(String[] args) {
		Person[] students;
		students = new Person[2];
		Person zhang = new Person();
		zhang.age = 15;
		zhang.height = 158;
		Person lee = new Person();
		lee.age = 16;
		lee.height = 1.61;
		students[0] = zhang;
		students[1] = lee;
		lee.info();
		zhang.info();
	}

}
