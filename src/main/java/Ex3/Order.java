package Ex3;

class Order {
    private Customer customer;
    private int id;

    public Order(Customer customer,int id) { this.customer = customer; this.id=id;}

       public void printShippingLabel() {
        String city = customer.getAddress().getCity();    
        customer.getAddress().setCity(city.trim().toUpperCase());
        System.out.println("Shipping to: " + city);

    }

    public Customer getCustomer() { return customer; }
}
