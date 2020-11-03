package api;

import util.ApiClient;
import domain.Account;
import domain.Error;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
public class AccountApiTest {

    private AccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountApi.class);
    }


    /**
     * Delete a customer account.
     *
     * Delete an existing customer account.
     */
    @Test
    public void deleteAccountTest() {
        String id = null;
        // Void response = api.deleteAccount(id);

        // TODO: test validations
    }

    /**
     * Update a customer account.
     *
     * Replace an existing customer account with a new version.
     */
    @Test
    public void updateCustomerTest() {
        Account body = null;
        String id = null;
        // Account response = api.updateCustomer(body, id);

        // TODO: test validations
    }
}
