/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.bigtop.bigpetstore.datagenerator.generators.products;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

public class ProductConstants
{		
	public static final String PRODUCT_QUANTITY = "quantity";
	public static final String PRODUCT_CATEGORY = "category";
	public static final String PRODUCT_UNIT_PRICE = "unitPrice";
	public static final String PRODUCT_PRICE = "price";
	
	/*
	 *  Until we have a more intelligent way (e.g., based on range) of dealing with prices,
	 *  let's exclude them.
	 */
	public static final Set<String> PRODUCT_MODEL_EXCLUDED_FIELDS = ImmutableSet.of(PRODUCT_CATEGORY,
			PRODUCT_UNIT_PRICE,
			PRODUCT_PRICE);
}
