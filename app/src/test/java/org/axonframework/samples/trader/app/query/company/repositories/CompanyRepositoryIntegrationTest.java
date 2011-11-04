/*
 * Copyright (c) 2011. Gridshore
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.axonframework.samples.trader.app.query.company.repositories;

import org.axonframework.domain.UUIDAggregateIdentifier;
import org.axonframework.samples.trader.app.query.company.CompanyEntry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Jettro Coenradie
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/spring/persistence-infrastructure-context.xml"})
public class CompanyRepositoryIntegrationTest {
    @Autowired
    private CompanyRepository companyRepository;

    @Test
    public void storeCompanyInRepository() {
        CompanyEntry companyEntry = new CompanyEntry();
        companyEntry.setIdentifier(new UUIDAggregateIdentifier().asString());
        companyEntry.setValue(100000);
        companyEntry.setAmountOfShares(1000);
        companyEntry.setTradeStarted(true);

        companyRepository.save(companyEntry);

    }
}