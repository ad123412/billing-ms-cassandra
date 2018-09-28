package com.digital.api.repository;

import com.digital.api.model.BillFormatRef;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillFormatRepository extends ReactiveCassandraRepository<BillFormatRef, String> {
}
