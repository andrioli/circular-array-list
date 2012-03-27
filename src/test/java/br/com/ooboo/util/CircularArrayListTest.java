package br.com.ooboo.util;

import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;

import com.google.common.collect.testing.ListTestSuiteBuilder;
import com.google.common.collect.testing.TestStringListGenerator;
import com.google.common.collect.testing.features.CollectionFeature;
import com.google.common.collect.testing.features.CollectionSize;
import com.google.common.collect.testing.features.ListFeature;

public class CircularArrayListTest extends TestCase {
	
	public static Test suite() {
		return ListTestSuiteBuilder.using(
				
			new TestStringListGenerator(){
				@Override
				protected List<String> create(String[] elements) {
					return new CircularArrayList<String>(Arrays.asList(elements));
				}
			})
			.named("CircularArrayList Tests")
			.withFeatures(
					ListFeature.GENERAL_PURPOSE,
					CollectionFeature.ALLOWS_NULL_VALUES,
					CollectionFeature.FAILS_FAST_ON_CONCURRENT_MODIFICATION,
					CollectionSize.ANY)
			.createTestSuite();
	}

}
