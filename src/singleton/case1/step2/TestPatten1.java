package singleton.case1.step2;

public class TestPatten1 {
	public static void main(String[] args) {
		Database database;
		
		database = Database.getInstance("첫번째 database");
		System.out.println(database.getName());
	
		database = Database.getInstance("두번째 database");
		System.out.println(database.getName());
	}
}
