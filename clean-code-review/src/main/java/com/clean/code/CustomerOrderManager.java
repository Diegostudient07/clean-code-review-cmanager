package com.clean.code;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CustomerOrderManager {

    private static final Logger logger = Logger.getLogger(CustomerOrderManager.class.getName());

    private final List<String> customers = new ArrayList<>();
    private final List<String> orders = new ArrayList<>();

    public CustomerOrderManager() {
        // Constructor explícito recomendado por PMD
    }

    public void addCustomer(final String name) {
        if (name == null || name.isBlank()) {
            logger.warning("Cannot add an empty customer name.");
            return;
        }
        customers.add(name);
        logger.info("Customer added: " + name);
    }

    public void addOrder(final String order) {
        if (order == null || order.isBlank()) {
            logger.warning("Cannot add an empty order.");
            return;
        }
        orders.add(order);
        logger.info("Order added: " + order);
    }

    public void processOrders(final String customerName) {
        if (!customers.contains(customerName)) {
            logger.warning("Customer not found: " + customerName);
            return;
        }

        logger.info("Processing orders for: " + customerName);
        orders.forEach(order -> logger.info("Processing order: " + order));
    }

    public void generateReport() {
        logger.info("Customer Report");
        customers.forEach(customer -> logger.info("Customer: " + customer));

        logger.info("Order Report");
        orders.forEach(order -> logger.info("Order: " + order));
    }

    public static void main(String[] args) {
        CustomerOrderManager manager = new CustomerOrderManager();

        manager.addCustomer("John Doe");
        manager.addCustomer("Jane Smith");

        manager.addOrder("Order1");
        manager.addOrder("Order2");

        manager.processOrders("John Doe");
        manager.generateReport();
    }
}
