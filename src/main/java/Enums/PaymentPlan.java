package Enums;

public enum PaymentPlan {
    P("Platinum"),
    G("Gold"),
    B("Basic");
    private final String desc;
    PaymentPlan (String desc){this.desc = desc;}

    public String getDesc() {
        return desc;
    }
}
