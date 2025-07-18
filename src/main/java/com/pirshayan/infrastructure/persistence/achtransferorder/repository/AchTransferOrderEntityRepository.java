package com.pirshayan.infrastructure.persistence.achtransferorder.repository;

import com.pirshayan.infrastructure.persistence.achtransferorder.entity.AchTransferOrderEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AchTransferOrderEntityRepository implements PanacheRepositoryBase<AchTransferOrderEntity, String> {

}
