package com.Invoice;

import org.assertj.core.api.AbstractBooleanArrayAssert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class InvoiceApplicationTests {

	@Test
	void filterInvoices() {

		InvoiceDao dao = new InvoiceDao();
		Invoice cuba = new Invoice("Cuba", 100);
		Invoice jakub = new Invoice("Jakub", 250);

		dao.save(cuba);
		dao.save(jakub);

		InvoiceFilter filter = new InvoiceFilter();
		List<Invoice> result = filter.filter();

		assertThat(result).containsExactly();

		dao.close();
	}

	private <SELF extends AbstractBooleanArrayAssert<SELF>> AbstractBooleanArrayAssert assertThat(final List<Invoice> result) {
		return null;
	}
}

