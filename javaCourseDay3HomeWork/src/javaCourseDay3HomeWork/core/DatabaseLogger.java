package javaCourseDay3HomeWork.core;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı : " + data);
	}

}
