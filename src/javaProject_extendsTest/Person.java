package javaProject_extendsTest;

public class Person {
	
	// 인스턴스 멤버
		private String name;
		private String age;
		private String[] hobbies;
		
		//getters / setters 
		//getters 만 받음
		//생성자 매개변수 3개로 등록해서 
		//인스턴스를 한번 등록 후 변경을 잘 안해서.
		
		
		public String getName() {
			return name;
		}
		public String getAge() {
			return age;
		}
		public String[] getHobbies() {
			return hobbies;
		}
		
		//말하기
		//인스턴스 메소드
		public void speak() {
			System.out.println("hello~!");
		}
		public void eat() {
			System.out.println("냠냠쩝쩝");
		}
		public void walking() {
			System.out.println("걷기");
		}
		public void sleep() {
			System.out.println("잠자기");
	}

}

