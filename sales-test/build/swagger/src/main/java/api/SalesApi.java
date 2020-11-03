package api;

import util.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import domain.Error;
import domain.Sale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SalesApi {
  /**
   * Add new sale.
   * Add a new sale to the system.
   * @param body  (required)
   * @return Call&lt;Sale&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sales")
  Call<Sale> addNewSale(
                    @retrofit2.http.Body Sale body    
  );

  /**
   * Delete a sale.
   * Delete the sale matching the given ID.
   * @param id  (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("sales/{id}")
  Call<Void> deleteSale(
            @retrofit2.http.Path("id") String id            
  );

}
