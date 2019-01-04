/*
 * Copyright 2010-2019 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.service.api.action.application;

import com.hack23.cia.service.api.action.common.AbstractResponse;

/**
 * The Class CreateApplicationEventResponse.
 */
public final class CreateApplicationEventResponse extends AbstractResponse {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new creates the application event response.
	 *
	 * @param result
	 *            the result
	 */
	public CreateApplicationEventResponse(final ServiceResult result) {
		super(result);
	}

}
