package com.caco.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.caco.generic.model.GenericModel;

@Entity
@Table(name = "products")
public class Products implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_product")
	private long idProduct;

	@Column(name = "n_product_code", nullable = false)
	private long productCode;

	@Column(name = "s_product_name", nullable = false)
	private String productName;

	@Column(name = "s_description", nullable = true)
	private String description;

	@Column(name = "n_price", nullable = false)
	private long price;

	@Column(name = "s_size", nullable = true)
	private String size;

	@Column(name = "s_color", nullable = true)
	private String color;

	@Column(name = "s_category", nullable = true)
	private String category;

	@Column(name = "n_quantity", nullable = false)
	private long quantity;

	@ManyToOne
	@JoinColumn(name = "id_store", referencedColumnName = "id_store")
	private Stores stores;

	/*
	 * @OneToMany(mappedBy = "products", fetch = FetchType.LAZY, cascade =
	 * CascadeType.ALL) private List <Products> productsCollection;
	 * 
	 * public List<Products> getProductsCollection() { return
	 * productsCollection; }
	 * 
	 * public void setProductsCollection(List<Products> productsCollection) {
	 * this.productsCollection = productsCollection; }
	 */

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Stores stores) {
		this.stores = stores;
	}

	public Stores getIdStore() {
		return stores;
	}

	public long getProductCode() {
		return productCode;
	}

	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@Override
	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Serializable id) {
		// TODO Auto-generated method stub
		
	}

}