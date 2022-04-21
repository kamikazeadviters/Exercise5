package Enums;

public enum PaymentMethod {
    C("Cash"),
    CR("Credit card"),
    D("Debit card");
    private final String desc;
    PaymentMethod (String desc) {this.desc = desc;}

    public String getDesc() {
        return desc;
    }
}
