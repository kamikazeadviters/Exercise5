package Main;

import Enums.ArgentineProvinces;
import Enums.PaymentMethod;
import Enums.PaymentPlan;
import models.GymStaff;
import models.GymStaffAdress;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		var address = new GymStaffAdress
				("Hornos",
				810,
				"Barracas",
				ArgentineProvinces.CABA);
		var postulante = new GymStaff ("Pablo Gonzalez", LocalDate.of(1992, 12, 22),
				35951253,
				1.65,
				92,
				PaymentPlan.B,
				PaymentMethod.C);
		postulante.showStaffinfo();
		address.showAddressInfo();
	}
}
