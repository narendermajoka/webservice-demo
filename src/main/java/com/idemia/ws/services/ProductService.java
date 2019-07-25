package com.idemia.ws.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.idemia.ws.model.Product;

@WebService(serviceName="ProductService")
public interface ProductService {
	
	@WebMethod(operationName="ListProducts")
	@WebResult(name="product")
	public List<String> getProducts();
	
	@WebMethod(operationName="GetProductById")
	@WebResult(name="product")
	public Product getProductDetails(@WebParam(name="productId") Integer id);
	
}
