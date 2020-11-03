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

public interface AccountsApi {
  /**
   * Add a new customer account.
   * Add a new customer account.
   * @param body  (required)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("accounts")
  Call<Account> createAccount(
                    @retrofit2.http.Body Account body    
  );

  /**
   * Get customer accounts.
   * Get the complete details for all accounts.
   * @return Call&lt;List&lt;Account&gt;&gt;
   */
  @GET("accounts")
  Call<List<Account>> getAccounts();
    

}
