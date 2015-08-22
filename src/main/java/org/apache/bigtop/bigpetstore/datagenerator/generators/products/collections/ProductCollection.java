package org.apache.bigtop.bigpetstore.datagenerator.generators.products.collections;

import java.util.List;

import org.apache.bigtop.bigpetstore.datagenerator.generators.products.ProductCategory;

public interface ProductCollection
{
	public List<ProductCategory> generateProductCategories();
}
