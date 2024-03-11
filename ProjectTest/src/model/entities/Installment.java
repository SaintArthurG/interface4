package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate date;
    private Double amount;
    public Installment(){

    }

    public Installment(LocalDate dueDate, Double amount) {
        this.date = dueDate;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(date.format(fmt)).append(" - ").append(String.format("%.2f", amount));
        return sb.toString();
    }
}
