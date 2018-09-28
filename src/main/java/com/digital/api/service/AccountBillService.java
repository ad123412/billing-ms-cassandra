package com.digital.api.service;

import com.digital.api.model.BillFormatRef;
import com.digital.api.model.BillPresentationMediaRef;
import com.digital.api.model.BillStructure;
import com.digital.api.model.BillingCycleSpecificationRef;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

public interface AccountBillService {

    public Mono<BillingCycleSpecificationRef> getBillingCycleSpecificationById(String id);

    public Mono<BillPresentationMediaRef> getBillPresentationMediaById(String id);

    public Mono<BillFormatRef> getBillFormatById(String id);

    public Flux<BillingCycleSpecificationRef> getAllBillingCycleSpecification();

    public Flux<BillPresentationMediaRef> getAllBillPresentationMedia();

    public Flux<BillFormatRef> getAllBillFormat();
}
