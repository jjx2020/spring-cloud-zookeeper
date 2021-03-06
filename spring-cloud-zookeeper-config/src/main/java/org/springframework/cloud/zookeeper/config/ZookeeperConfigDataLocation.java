/*
 * Copyright 2015-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.zookeeper.config;

import java.util.Objects;

import org.springframework.boot.context.config.ConfigDataLocation;
import org.springframework.core.style.ToStringCreator;

public class ZookeeperConfigDataLocation extends ConfigDataLocation {

	private final String context;
	private final boolean optional;

	public ZookeeperConfigDataLocation(String context, boolean optional) {
		this.context = context;
		this.optional = optional;
	}

	public String getContext() {
		return this.context;
	}

	public boolean isOptional() {
		return this.optional;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ZookeeperConfigDataLocation that = (ZookeeperConfigDataLocation) o;
		return this.optional == that.optional &&
				this.context.equals(that.context);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.optional, this.context);
	}

	@Override
	public String toString() {
		return new ToStringCreator(this)
				.append("context", context)
				.append("optional", optional)
				.toString();

	}
}
