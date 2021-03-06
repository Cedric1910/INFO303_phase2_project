/*
 * Sales Service
 * REST service for managing customer sales.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import domain.Customer;
import domain.SaleItem;
import domain.Totals;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Sale
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-11T20:45:18.670994+12:00[Pacific/Auckland]")
public class Sale {
  @SerializedName("id")
  private String id = null;

  @SerializedName("sale_date")
  private String saleDate = null;

  @SerializedName("customer")
  private Customer customer = null;

  @SerializedName("register_sale_products")
  private List<SaleItem> registerSaleProducts = null;

  @SerializedName("totals")
  private Totals totals = null;

  public Sale id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Sale saleDate(String saleDate) {
    this.saleDate = saleDate;
    return this;
  }

   /**
   * Get saleDate
   * @return saleDate
  **/
  @Schema(description = "")
  public String getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(String saleDate) {
    this.saleDate = saleDate;
  }

  public Sale customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @Schema(description = "")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Sale registerSaleProducts(List<SaleItem> registerSaleProducts) {
    this.registerSaleProducts = registerSaleProducts;
    return this;
  }

  public Sale addRegisterSaleProductsItem(SaleItem registerSaleProductsItem) {
    if (this.registerSaleProducts == null) {
      this.registerSaleProducts = new ArrayList<>();
    }
    this.registerSaleProducts.add(registerSaleProductsItem);
    return this;
  }

   /**
   * Get registerSaleProducts
   * @return registerSaleProducts
  **/
  @Schema(description = "")
  public List<SaleItem> getRegisterSaleProducts() {
    return registerSaleProducts;
  }

  public void setRegisterSaleProducts(List<SaleItem> registerSaleProducts) {
    this.registerSaleProducts = registerSaleProducts;
  }

  public Sale totals(Totals totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @Schema(description = "")
  public Totals getTotals() {
    return totals;
  }

  public void setTotals(Totals totals) {
    this.totals = totals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sale sale = (Sale) o;
    return Objects.equals(this.id, sale.id) &&
        Objects.equals(this.saleDate, sale.saleDate) &&
        Objects.equals(this.customer, sale.customer) &&
        Objects.equals(this.registerSaleProducts, sale.registerSaleProducts) &&
        Objects.equals(this.totals, sale.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, saleDate, customer, registerSaleProducts, totals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sale {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    saleDate: ").append(toIndentedString(saleDate)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    registerSaleProducts: ").append(toIndentedString(registerSaleProducts)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
