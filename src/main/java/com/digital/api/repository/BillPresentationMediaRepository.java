package com.digital.api.repository;

import com.digital.api.model.BillPresentationMediaRef;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillPresentationMediaRepository extends ReactiveCassandraRepository<BillPresentationMediaRef, String> {
}
