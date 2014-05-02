/**
 * Copyright - Property of PFE Corportation
 */
package com.pfecorp.crm.infrastructure;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.map.SerializationConfig;

/**
 * @author Ben Northrop
 */
public class ObjectMapper extends org.codehaus.jackson.map.ObjectMapper {
	public ObjectMapper() {
		setVisibilityChecker(getSerializationConfig()
				.getDefaultVisibilityChecker()
				.withCreatorVisibility(JsonAutoDetect.Visibility.NONE)
				.withFieldVisibility(JsonAutoDetect.Visibility.PUBLIC_ONLY)
				.withGetterVisibility(JsonAutoDetect.Visibility.NONE)
				.withIsGetterVisibility(JsonAutoDetect.Visibility.NONE)
				.withSetterVisibility(JsonAutoDetect.Visibility.DEFAULT));
		configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
	}
}
