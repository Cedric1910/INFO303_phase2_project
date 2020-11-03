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
 * API tests for AccountsApi
 */
public class AccountsApiTest {

    private AccountsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountsApi.class);
    }


    /**
     * Add a new customer account.
     *
     * Add a new customer account.
     */
    @Test
    public void createAccountTest() {
        Account body = null;
        // Account response = api.createAccount(body);

        // TODO: test validations
    }

    /**
     * Get customer accounts.
     *
     * Get the complete details for all accounts.
     */
    @Test
    public void getAccountsTest() {
        // List<Account> response = api.getAccounts();

        // TODO: test validations
    }
}
