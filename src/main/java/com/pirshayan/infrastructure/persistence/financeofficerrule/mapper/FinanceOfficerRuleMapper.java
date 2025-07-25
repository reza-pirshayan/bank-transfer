package com.pirshayan.infrastructure.persistence.financeofficerrule.mapper;

import com.pirshayan.domain.model.financeofficerrule.FinanceOfficerRuleAggregateRoot;
import com.pirshayan.domain.model.financeofficerrule.FinanceOfficerRuleId;
import com.pirshayan.infrastructure.persistence.financeofficerrule.entity.FinanceOfficerRuleEntity;

public class FinanceOfficerRuleMapper {
	public static FinanceOfficerRuleAggregateRoot toModel(FinanceOfficerRuleEntity entity) {
		FinanceOfficerRuleId financeOfficerRuleId = new FinanceOfficerRuleId(entity.getId());
		Boolean isAllowedToSignAsFirst = entity.getAllowedToSignAsFirst();
		Boolean isAllowedToSignAsSecond = entity.getAllowedToSignAsSecond();
		Boolean isAllowedToSend = entity.getAllowedToSend();
		Long maxFirstSignAmount = entity.getMaxFirstSignAmount();
		Long maxSecondSignAmount = entity.getMaxSecondSignAmount();
		Long maxSendAmount = entity.getMaxSendAmount();
		FinanceOfficerRuleAggregateRoot.Builder builder = new FinanceOfficerRuleAggregateRoot.Builder(
				financeOfficerRuleId, isAllowedToSignAsFirst, isAllowedToSignAsSecond, isAllowedToSend,
				maxFirstSignAmount, maxSecondSignAmount, maxSendAmount);

		Integer positionId = entity.getPositionEntity().getId();

		switch (positionId) {
			case 10 -> builder.setCeo();
			case 11 -> builder.setCfo();
			case 12 -> builder.setFinanceDirectorGeneral();
			case 13 -> builder.setDeputyFinanceDirectorGeneral();
			case 22 -> builder.setRegionalDirectorGeneral();
			case 23 -> builder.setDeputyRegionalDirectorGeneral();
			case 24 -> builder.setBranchManager();
			case 25 -> builder.setDeputyBranchFinanceManager();
			case 30 -> builder.setPermanentFinancePersonnel();
			case 32 -> builder.setContranctFinancePersonnel();
			default -> throw new IllegalStateException("Unexpected position ID: " + positionId);
		}

//		return switch (positionId) {
//			case 10 -> builder.setCeo().build();
//			case 11 -> builder.setCfo().build();
//			case 12 -> builder.setFinanceDirectorGeneral().build();
//			case 13 -> builder.setDeputyFinanceDirectorGeneral().build();
//			case 22 -> builder.setRegionalDirectorGeneral().build();
//			case 23 -> builder.setDeputyRegionalDirectorGeneral().build();
//			case 24 -> builder.setBranchManager().build();
//			case 25 -> builder.setDeputyBranchFinanceManager().build();
//			case 30 -> builder.setPermanentFinancePersonnel().build();
//			case 32 -> builder.setContranctFinancePersonnel().build();
//			default -> throw new IllegalStateException("Unexpected position ID: " + positionId);
//		};

		return builder.build();

	}

	public static FinanceOfficerRuleEntity toEntity(FinanceOfficerRuleAggregateRoot root) {
		// Not implemented: Won't be used on our project example;
		return null;
	}
}
