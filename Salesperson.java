public class Salesperson {
    private String salespersonId;
    private String name;

    public Salesperson(String salespersonId, String name) {
        this.salespersonId = salespersonId;
        this.name = name;
    }

    public String getSalespersonId() {
        return salespersonId;
    }

    public String getName() {
        return name;
    }
}