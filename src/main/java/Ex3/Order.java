package Ex3;

class Order {
    private Customer customer;

    public Order(Customer customer) { this.customer = customer; }

       public void printShippingLabel() {
        String city = customer.getAddress().getCity();
        System.out.println("Shipping to: " + city);

        // Bad: Order changing internals of Address directly via chain
        customer.getAddress().setCity(city.trim().toUpperCase());
    }

    public Customer getCustomer() { return customer; }
}