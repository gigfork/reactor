/*
 * Copyright 2002-2011 the original author or authors.
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

package reactor.web.http.server;

import reactor.util.MultiValueMap;
import reactor.web.http.HttpInputMessage;
import reactor.web.http.HttpRequest;

import java.security.Principal;

/**
 * Represents a server-side HTTP request.
 *
 * @author Arjen Poutsma
 */
public interface ServerHttpRequest<T> extends HttpRequest, HttpInputMessage<T> {

	/**
	 * Returns the map of query parameters. Empty if no query has been set.
	 */
	MultiValueMap<String, String> getQueryParams();

	/**
	 * Return a {@link java.security.Principal} instance containing the name of the authenticated user. If the user has not
	 * been authenticated, the method returns <code>null</code>.
	 */
	Principal getPrincipal();

	/**
	 * Return the host name of the endpoint on the other end.
	 */
	String getRemoteHostName();

	/**
	 * Return the IP address of the endpoint on the other end.
	 */
	String getRemoteAddress();

}