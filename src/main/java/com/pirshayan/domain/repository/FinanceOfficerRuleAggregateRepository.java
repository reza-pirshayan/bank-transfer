package com.pirshayan.domain.repository;

import com.pirshayan.domain.model.financeofficerrule.FinanceOfficerRuleAggregateRoot;
import com.pirshayan.domain.model.financeofficerrule.FinanceOfficerRuleId;

public interface FinanceOfficerRuleAggregateRepository {
	public FinanceOfficerRuleAggregateRoot findById(FinanceOfficerRuleId financeOfficerRuleId);
}
