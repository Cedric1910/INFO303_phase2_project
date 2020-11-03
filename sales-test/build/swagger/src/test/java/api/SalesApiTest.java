package api;

import util.ApiClient;
import domain.Error;
import domain.Sale;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SalesApi
 */
public class SalesApiTest {

    private SalesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SalesApi.class);
    }


    /**
     * Add new sale.
     *
     * Add a new sale to the system.
     */
    @Test
    public void addNewSaleTest() {
        Sale body = null;
        // Sale response = api.addNewSale(body);

        // TODO: test validations
    }

    /**
     * Delete a sale.
     *
     * Delete the sale matching the given ID.
     */
    @Test
    public void deleteSaleTest() {
        String id = null;
        // Void response = api.deleteSale(id);

        // TODO: test validations
    }
}
