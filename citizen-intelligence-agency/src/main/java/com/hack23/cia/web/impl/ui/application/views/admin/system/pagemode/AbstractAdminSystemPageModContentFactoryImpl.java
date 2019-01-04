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
package com.hack23.cia.web.impl.ui.application.views.admin.system.pagemode;

import org.springframework.beans.factory.annotation.Autowired;

import com.hack23.cia.web.impl.ui.application.views.common.pagemode.AbstractBasicPageModContentFactoryImpl;
import com.hack23.cia.web.impl.ui.application.views.common.paging.PagingUtil;

/**
 * The Class AbstractAdminSystemPageModContentFactoryImpl.
 */
public abstract class AbstractAdminSystemPageModContentFactoryImpl extends AbstractBasicPageModContentFactoryImpl {

	private final String viewName;

	@Autowired
	private PagingUtil pagingUtil;
	
	/**
	 * Instantiates a new abstract admin system page mod content factory impl.
	 *
	 * @param viewName the view name
	 */
	AbstractAdminSystemPageModContentFactoryImpl(final String viewName) {
		super();
		this.viewName = viewName;
	}

	@Override
	public boolean matches(final String page, final String parameters) {
		return viewName.equals(page);
	}

	/**
	 * Gets the paging util.
	 *
	 * @return the paging util
	 */
	protected final PagingUtil getPagingUtil() {
		return pagingUtil;
	}

}
