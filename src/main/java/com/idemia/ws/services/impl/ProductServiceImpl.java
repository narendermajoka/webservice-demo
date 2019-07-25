package com.idemia.ws.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.annotations.Logging;
import org.springframework.stereotype.Service;

import com.idemia.ws.model.Product;
import com.idemia.ws.services.ProductService;

@Service
@Logging
public class ProductServiceImpl implements ProductService {

	@Override
	public List<String> getProducts() {
		List<String> products = new ArrayList<>();
		products.add("Nivea");
		products.add("Beardo");
		return products;
	}

	@Override
	public Product getProductDetails(Integer id) {
		System.out.println("fetching details for ID: " + id);
		return new Product(id, "Nivea", 200);
	}

}
