package models;

import Enums.ArgentineProvinces;

public class GymStaffAdress {
    private String address;
    private int addressNumber;
    private String neighbour;
    private ArgentineProvinces provinces = ArgentineProvinces.CABA;

    public void setAddress(String address) {this.address = address;}
    public String getAddress() {return address;}
    public void setAddressNumber(int addressNumber) {this.addressNumber = addressNumber;}
    public int getAddressNumber() {return addressNumber;}
    public void setNeighbour(String neighbour) {this.neighbour = neighbour;}
    public String getNeighbour() {return neighbour;}
    public ArgentineProvinces getProvinces() {return provinces;}
    public void setProvinces(ArgentineProvinces provinces) {this.provinces = provinces;}

    public GymStaffAdress (String address, int addressNumber, String neighbour, ArgentineProvinces provinces)
    {
        setAddress(address);
        setAddressNumber(addressNumber);
        setNeighbour(neighbour);
        setProvinces(provinces);
    }
    public void showAddressInfo()
    {
        System.out.printf("Calle: %s%n", this.getAddress());
        System.out.printf("Numero: %s%n", this.getAddressNumber());
        System.out.printf("Barrio: %s%n", this.getNeighbour());
        System.out.printf("Provincia: %s%n", this.getProvinces().getDesc());
    }
}
