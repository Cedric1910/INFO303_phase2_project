package api;

import util.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import domain.Account;
import domain.ErrorMessage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountApi {
  /**
   * Delete a customer account.
   * Delete an existing customer account.
   * @param id The customer&#x27;s account ID. (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("accounts/account/{id}")
  Call<Void> deleteAccount(
            @retrofit2.http.Path("id") String id            
  );

  /**
   * Update a customer account.
   * Replace an existing customer account with a new version.
   * @param body  (required)
   * @param id The customer&#x27;s account ID. (required)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("accounts/account/{id}")
  Call<Account> updateCustomer(
                    @retrofit2.http.Body Account body    ,         @retrofit2.http.Path("id") String id            
  );

}
