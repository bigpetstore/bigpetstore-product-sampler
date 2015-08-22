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
package org.apache.bigtop.bigpetstore.datagenerator.generators.products.rules;

import java.util.Map;

import org.apache.bigtop.bigpetstore.datagenerator.generators.products.Product;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class TestFieldPredicate
{

	@Test
	public void testRuleMatches()
	{
		Map<String, Object> fields = ImmutableMap.of("brand", (Object) "Chef Corgi",
				"flavor", (Object) "chicken");
		Product product = new Product(fields);
		
		Rule rule = new FieldPredicate("brand", "Chef Corgi");
		Assert.assertTrue(rule.ruleMatches(product));
		
		rule = new FieldPredicate("brand", "Happy Pup");
		Assert.assertFalse(rule.ruleMatches(product));
	}
}
