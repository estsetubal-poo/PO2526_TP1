package Ex3;

class Customer {
    private Address address;
    private String name;
    public Customer(Address address,String name) { this.address = address; this.name=name;}
    public Address getAddress() { return address; }
}
