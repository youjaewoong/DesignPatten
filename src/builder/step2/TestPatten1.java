package builder.step2;

import java.time.LocalDate;
import java.time.Month;

public class TestPatten1 {
	public static void main(String[] args) {
		
		Person p1 = Person.builder()
				.firstName("firstName")
				.lastName("LastName")
				.addressOne("서울")
				.addressTwo("강남구")
				.birthDate(LocalDate.of(1995, Month.APRIL, 13))
				.sex("male")
				.driverLicence(true)
				.married(true)
				.build();
		
		System.out.println(p1.getAddressOne());
	}
}