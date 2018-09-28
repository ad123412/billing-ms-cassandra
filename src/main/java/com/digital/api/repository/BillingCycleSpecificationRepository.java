package com.digital.api.repository;

import com.digital.api.model.BillingCycleSpecificationRef;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingCycleSpecificationRepository extends ReactiveCassandraRepository<BillingCycleSpecificationRef, String> {
}
