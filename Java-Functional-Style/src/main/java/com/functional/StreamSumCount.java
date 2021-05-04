package com.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSumCount {

	public static void main(String[] args) {

		List<Product> productsList = Arrays.asList(new Product(1, "HP Laptop", 24000f),
				new Product(2, "Dell Laptop", 29000f), new Product(3, "Lenevo Laptop", 45000f),
				new Product(4, "Sony Laptop", 50000f), new Product(5, "Apple Laptop", 91000f));

		// count objects by name and not null
		System.out.println(productsList.stream().filter(product -> product.getName() != null)
				.map(product -> product.getName()).count());

		// Sum of product price
		System.out.println(productsList.stream().collect(Collectors.summingDouble(product -> product.getPrice())));
		
		// Method References
//		System.out.println(productsList.stream().collect(Collectors.summingDouble(Product::getPrice)));

		// max() method to get max Product price
		Product productA = productsList.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(productA.getPrice());

		// min() method to get min Product price
		Product productB = productsList.stream().min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(productB.getPrice());

		// Converting product List into Set
		Set<Float> productPriceList = productsList.stream().filter(product -> product.price < 30000) // filter product
																										// on the base
																										// of price
				.map(product -> product.price).collect(Collectors.toSet()); // collect it as Set(remove duplicate
																			// elements)
		System.out.println(productPriceList);

		// Converting Product List into a Map
		Map<Integer, String> productPriceMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
		for (Map.Entry<Integer, String> entry : productPriceMap.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

	}

}
