package com.digital.api.service;

import com.digital.api.model.BillFormatRef;
import com.digital.api.model.BillPresentationMediaRef;
import com.digital.api.model.BillingCycleSpecificationRef;
import com.digital.api.repository.BillFormatRepository;
import com.digital.api.repository.BillPresentationMediaRepository;
import com.digital.api.repository.BillingCycleSpecificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountBillServiceImpl implements AccountBillService {


    @Autowired
    private BillFormatRepository billFormatRepository;

    @Autowired
    private BillPresentationMediaRepository billPresentationMediaRepository;

    @Autowired
    private BillingCycleSpecificationRepository billingCycleSpecificationRepository;


    @Override
    public Mono<BillingCycleSpecificationRef> getBillingCycleSpecificationById(String id) {

        Mono<BillingCycleSpecificationRef> billingCycleSpecificationRefMono =
                billingCycleSpecificationRepository.findById(id);
        return billingCycleSpecificationRefMono;
    }

    @Override
    public Mono<BillPresentationMediaRef> getBillPresentationMediaById(String id) {

        Mono<BillPresentationMediaRef> billPresentationMediaRefMono =
                billPresentationMediaRepository.findById(id);
        return billPresentationMediaRefMono;
    }

    @Override
    public Mono<BillFormatRef> getBillFormatById(String id) {

        Mono<BillFormatRef> billFormatRefMono =
                billFormatRepository.findById(id);
        return billFormatRefMono;
    }

    @Override
    public Flux<BillingCycleSpecificationRef> getAllBillingCycleSpecification() {

        return billingCycleSpecificationRepository.findAll();
    }

    @Override
    public Flux<BillPresentationMediaRef> getAllBillPresentationMedia() {

        return billPresentationMediaRepository.findAll();
    }

    @Override
    public Flux<BillFormatRef> getAllBillFormat() {

        return billFormatRepository.findAll();
    }
}
