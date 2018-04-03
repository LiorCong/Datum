/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mipha.olap.support;

import javax.persistence.AttributeConverter;

import org.mipha.util.JsonUtils;

/**
 * 属性转换器用于实体属性同数据库数据的转换.
 * 
 * @author 7cat
 * @since 1.0
 */
public class JsonAttributeConverter implements AttributeConverter<Object, String> {

	@Override
	public String convertToDatabaseColumn(Object attribute) {
		return JsonUtils.marshal(attribute);
	}

	@Override
	public Object convertToEntityAttribute(String data) {
		return JsonUtils.unmarshal(data);
	}
}
