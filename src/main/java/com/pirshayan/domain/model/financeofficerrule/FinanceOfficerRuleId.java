package com.pirshayan.domain.model.financeofficerrule;

import java.util.Objects;

public class FinanceOfficerRuleId {
	private final Long id;

	public FinanceOfficerRuleId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FinanceOfficerRuleId other = (FinanceOfficerRuleId) obj;
		return Objects.equals(id, other.id);
	}
}
