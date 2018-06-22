package com.aplatanao.SpringStartUp.services;

import com.aplatanao.SpringStartUp.persistance.InvoiceRepository;
import com.aplatanao.SpringStartUp.persistance.PaymentRepository;
import org.springframework.stereotype.Component;


@Component
public class AccountingService {
    private InvoiceRepository invoiceRepo;
    private PaymentRepository paymentRepo;

    public void setInvoiceRepo(InvoiceRepository invoiceRepo) {
        this.invoiceRepo = invoiceRepo;
    }

    public void setPaymentRepo(PaymentRepository paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

//    public Balance fetchBalance() {
//        return null;
//    }

    public int pay(int invoiceId) { return 0; }

    public int createInvoice(Double amount) {
        return 0;
    }
}
