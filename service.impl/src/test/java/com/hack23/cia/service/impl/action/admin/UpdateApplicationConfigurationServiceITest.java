/*
 * Copyright 2010 James Pether Sörling
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
package com.hack23.cia.service.impl.action.admin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import com.hack23.cia.model.internal.application.system.impl.ApplicationConfiguration;
import com.hack23.cia.model.internal.application.system.impl.ConfigurationGroup;
import com.hack23.cia.service.api.action.admin.UpdateApplicationConfigurationRequest;
import com.hack23.cia.service.api.action.admin.UpdateApplicationConfigurationResponse;
import com.hack23.cia.service.api.action.application.CreateApplicationSessionRequest;
import com.hack23.cia.service.api.action.common.ServiceResponse.ServiceResult;
import com.hack23.cia.service.data.api.ApplicationConfigurationService;
import com.hack23.cia.service.impl.AbstractServiceFunctionalIntegrationTest;

/**
 * The Class UpdateApplicationConfigurationServiceITest.
 */
public class UpdateApplicationConfigurationServiceITest extends AbstractServiceFunctionalIntegrationTest {

	/** The application configuration service. */
	@Autowired
	private ApplicationConfigurationService applicationConfigurationService;


	/**
	 * Success test.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void successTest() throws Exception {

		final Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_ANONYMOUS"));
		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

		SecurityContextHolder.getContext().setAuthentication(new AnonymousAuthenticationToken("key", "principal", authorities));

		final CreateApplicationSessionRequest createTestApplicationSession = createTestApplicationSession();

		final String randomUUID = UUID.randomUUID().toString();
		final ApplicationConfiguration applicationConfigurationToUpdate = applicationConfigurationService.checkValueOrLoadDefault(
				"UpdateApplicationRequestTest property",
				"UpdateApplicationRequestTest should be set to true/false",
				ConfigurationGroup.AUTHORIZATION, UpdateApplicationConfigurationServiceITest.class.getSimpleName(),
				"UpdateApplicationConfigurationService ITest", "FunctionalIntegrationTest",
				"UpdateApplicationRequestTest." + randomUUID, "true");


		final UpdateApplicationConfigurationRequest serviceRequest = new UpdateApplicationConfigurationRequest();
		serviceRequest.setApplicationConfigurationId(applicationConfigurationToUpdate.getHjid());
		serviceRequest.setSessionId(createTestApplicationSession.getSessionId());

		serviceRequest.setComponentDescription("componentDescription");
		serviceRequest.setConfigDescription("configDescription");
		serviceRequest.setConfigTitle("configTitle");
		serviceRequest.setComponentTitle("componentTitle");
		serviceRequest.setPropertyValue("false");

		final UpdateApplicationConfigurationResponse  response = (UpdateApplicationConfigurationResponse) applicationManager.service(serviceRequest);


		assertNotNull("Expect a result",response);
		assertEquals("Expect success", ServiceResult.SUCCESS,response.getResult());


		final ApplicationConfiguration applicationConfigurationUpdated = applicationConfigurationService.checkValueOrLoadDefault(
				"UpdateApplicationRequestTest property",
				"UpdateApplicationRequestTest should be set to true/false",
				ConfigurationGroup.AUTHORIZATION, UpdateApplicationConfigurationServiceITest.class.getSimpleName(),
				"UpdateApplicationConfigurationService ITest", "FunctionalIntegrationTest",
				"UpdateApplicationRequestTest." + randomUUID, "true");


		assertEquals("false",applicationConfigurationUpdated.getPropertyValue());
		assertEquals("configTitle",applicationConfigurationUpdated.getConfigTitle());
		assertEquals("configDescription",applicationConfigurationUpdated.getConfigDescription());
		assertEquals("componentTitle",applicationConfigurationUpdated.getComponentTitle());
		assertEquals("componentDescription",applicationConfigurationUpdated.getComponentDescription());

	}

}
