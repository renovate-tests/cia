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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:26:40 PM CET 
//


package com.hack23.cia.model.external.worldbank.countries.impl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {


    /**
	 * Instantiates a new object factory.
	 */
    public ObjectFactory() {
    }

    /**
	 * Creates a new Object object.
	 *
	 * @return the countries element
	 */
    public CountriesElement createCountriesElement() {
        return new CountriesElement();
    }

    /**
	 * Creates a new Object object.
	 *
	 * @return the country element
	 */
    public CountryElement createCountryElement() {
        return new CountryElement();
    }

    /**
	 * Creates a new Object object.
	 *
	 * @return the region
	 */
    public Region createRegion() {
        return new Region();
    }

    /**
	 * Creates a new Object object.
	 *
	 * @return the adminregion
	 */
    public Adminregion createAdminregion() {
        return new Adminregion();
    }

    /**
	 * Creates a new Object object.
	 *
	 * @return the income level
	 */
    public IncomeLevel createIncomeLevel() {
        return new IncomeLevel();
    }

    /**
	 * Creates a new Object object.
	 *
	 * @return the lending type
	 */
    public LendingType createLendingType() {
        return new LendingType();
    }

}
