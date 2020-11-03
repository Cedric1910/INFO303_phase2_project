package api;

import util.ApiClient;
import domain.Error;
import domain.Sale;
import domain.Summary;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SalesForCustomerApi
 */
public class SalesForCustomerApiTest {

    private SalesForCustomerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SalesForCustomerApi.class);
    }


    /**
     * Get sales for customer.
     *
     * Get all sales for the customer matching the given ID.
     */
    @Test
    public void getCustomerSalesTest() {
        String id = null;
        // List<Sale> response = api.getCustomerSales(id);

        // TODO: test validations
    }

    /**
     * Get sale summary for customer.
     *
     * Get a summary of sales for the customer matching the given ID.
     */
    @Test
    public void getCustomerSummaryTest() {
        String id = null;
        // Summary response = api.getCustomerSummary(id);

        // TODO: test validations
    }
}
