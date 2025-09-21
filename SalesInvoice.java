import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SalesInvoice {
    private String invoiceNumber;
    private LocalDate date;
    private Customer customer;
    private Salesperson salesperson;
    private NewVehicle vehicleSold;
    private TradeInVehicle tradeIn; 
    private double tradeInAllowance;
    private List<Option> selectedOptions;

    public SalesInvoice(String invoiceNumber, Customer customer, Salesperson salesperson, NewVehicle vehicleSold) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicleSold = vehicleSold;
        this.date = LocalDate.now();
        this.selectedOptions = new ArrayList<Option>();
    }

    public void addOption(Option option) {
        this.selectedOptions.add(option);
    }

    public void setTradeIn(TradeInVehicle tradeIn, double allowance) {
        this.tradeIn = tradeIn;
        this.tradeInAllowance = allowance;
    }

    public double calculateTotal() {
        double total = vehicleSold.getBaseCost();
        for (Option option : selectedOptions) {
            total += option.getPrice();
        }
        total -= tradeInAllowance;
        return total;
    }

    public void printInvoice() {
        System.out.println("=========================================");
        System.out.println("SALES INVOICE: " + invoiceNumber);
        System.out.println("Date: " + date);
        System.out.println("-----------------------------------------");
        System.out.println("Customer: " + customer.getName() + " (ID: " + customer.getCustomerId() + ")");
        System.out.println("Salesperson: " + salesperson.getName());
        System.out.println("-----------------------------------------");
        System.out.println(vehicleSold.toString());
        System.out.printf("Base Price: $%.2f%n", vehicleSold.getBaseCost());
        
        if (!selectedOptions.isEmpty()) {
            System.out.println("Added Options:");
            for (Option option : selectedOptions) {
                System.out.println(option.toString());
            }
        }

        if (tradeIn != null) {
            System.out.println(tradeIn.toString());
            System.out.printf("Trade-In Allowance: -$%.2f%n", tradeInAllowance);
        }
        
        System.out.println("-----------------------------------------");
        System.out.printf("TOTAL PRICE: $%.2f%n", calculateTotal());
        System.out.println("=========================================");
    }
}