package com.Invoice;

import java.util.ArrayList;
import java.util.List;

    public class InvoiceFilter {


        public List<Invoice> filter() {

            InvoiceDao invoiceDao = new InvoiceDao();
            List<Invoice> filtered = new ArrayList<>();

            List<Invoice> allInvoices = invoiceDao.all();

            for(Invoice inv : allInvoices) {
                if(inv.getValue() < 100.0)
                    filtered.add(inv);
            }

            return filtered;

        }
    }
