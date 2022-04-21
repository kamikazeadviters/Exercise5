package models;

import Enums.PaymentMethod;
import Enums.PaymentPlan;

import java.time.LocalDate;
import java.util.Date;

public class GymStaff {
    private String name;
    private LocalDate birth;
    private int identification;
    private double height;
    private int weight;
    private PaymentPlan paymentPlan = PaymentPlan.B;
    private PaymentMethod paymentMethod = PaymentMethod.C;



    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setBirth(LocalDate birth) {this.birth = birth;}

    public LocalDate getBirth() {return birth;}

    public void setIdentification(int identification) {this.identification = identification;}
    public int getIdentification() {return identification;}

    public void setHeight(double height) {this.height = height;}

    public double getHeight() {return height;}

    public void setWeight(int weight) {this.weight = weight;}
    public int getWeight() {return weight;}

    public void setPaymentPlan(PaymentPlan paymentPlan) {this.paymentPlan = paymentPlan;}
    public PaymentPlan getPaymentPlan() {return paymentPlan;}

    public void setPaymentMethod(PaymentMethod paymentMethod) {this.paymentMethod = paymentMethod;}
    public PaymentMethod getPaymentMethod() {return paymentMethod;}

    public GymStaff (String name, LocalDate birth, int identification, double height, int weight,
                     PaymentPlan paymentPlan, PaymentMethod paymentMethod)
    {
        setName(name);
        setBirth(birth);
        setIdentification(identification);
        setHeight(height);
        setWeight(weight);
        setPaymentPlan(paymentPlan);
        setPaymentMethod(paymentMethod);
    }
    public void showStaffinfo()
    {
        System.out.printf("Nombre: %s%n", this.getName());
        System.out.printf("Nacimiento: %s%n", this.getBirth());
        System.out.printf("DNI: %s%n", this.getIdentification());
        System.out.printf("Altura: %s%n", this.getHeight());
        System.out.printf("Peso: %s%n", this.getWeight());
        System.out.printf("Método de pago: %s%n", this.getPaymentMethod().getDesc());
        System.out.printf("Membresía: %s%n", this.getPaymentPlan().getDesc());
    }

}

