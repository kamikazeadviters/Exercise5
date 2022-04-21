package Enums;

public enum ArgentineProvinces {
    //Colocamos sólo tres a modo ilustrativo,
    //suponemos que la empresa sólo opera en estos tres territorios provinciales
    PBA("Buenos Aires"),
    CABA("City of Buenos Aires"),
    CBA("Cordoba");
    private final String desc;
    ArgentineProvinces (String desc){this.desc = desc;}

    public String getDesc() {
        return desc;
    }
}
