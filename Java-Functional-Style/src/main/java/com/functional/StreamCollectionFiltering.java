package com.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamCollectionFiltering {

	public static void main(String[] args) {

		List<Product> productsList = Arrays.asList(new Product(1, "HP Laptop", 25000f),
				new Product(2, "Dell Laptop", 29000f), new Product(3, "Lenevo Laptop", 45000f),
				new Product(4, "Sony Laptop", 50000f), new Product(5, "Apple Laptop", 90000f));

		// Filter product by price less than 30000

		// ************ Imperative Approach ***************//
		filterByPriceImperative(productsList);

		// ************ Functional/Declarative Approach ***************//
		filterByPriceDeclrative(productsList);

	}

	private static void filterByPriceDeclrative(List<Product> productsList) {
		productsList.stream().filter(product -> product.price < 30000).map(product -> product.price)
				.forEach(System.out::println);
	}

	private static void filterByPriceImperative(List<Product> productsList) {
		List<Float> productPriceList = new ArrayList<Float>();
		for (Product product : productsList) {
			// filtering data of list
			if (product.price < 30000) {
				productPriceList.add(product.price); // adding price to a productPriceList
			}
		}
		System.out.println(productPriceList); // displaying data
	}
}
