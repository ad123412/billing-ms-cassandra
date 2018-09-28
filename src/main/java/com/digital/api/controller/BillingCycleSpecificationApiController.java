package com.digital.api.controller;

import com.digital.api.model.BillingCycleSpecification;
import com.digital.api.service.AccountBillServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
public class BillingCycleSpecificationApiController {

    @Autowired
    private AccountBillServiceImpl accountBillService;

    @GetMapping(value = "/billingCycleSpecification",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Flux<BillingCycleSpecification> listBillingCycleSpecification(@ApiParam(value = "Comma separated properties to display in response") @RequestParam(value = "fields", required = false) String fields
            , @ApiParam(value = "Requested index for start of resources to be provided in response") @RequestParam(value = "offset", required = false) Integer offset
            ,@ApiParam(value = "Requested number of resources to be provided in response") @RequestParam(value = "limit", required = false) Integer limit
    ) {

        return accountBillService.getAllBillingCycleSpecification()
                .map(billingCycleSpecificationRef -> {
                    BillingCycleSpecification billingCycleSpecification = new BillingCycleSpecification();
                    BeanUtils.copyProperties(billingCycleSpecificationRef, billingCycleSpecification);
                    return billingCycleSpecification;
                });
    }



    @GetMapping(value = "/billingCycleSpecification/{id}",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Flux<BillingCycleSpecification> retrieveBillingCycleSpecification(
        @ApiParam(value = "Identifier of the Billing Cycle Specification",required=true ) @PathVariable("id") String id

    ){

        return accountBillService.getBillingCycleSpecificationById(id)
                .map(billingCycleSpecificationRef -> {
                    BillingCycleSpecification billingCycleSpecification = new BillingCycleSpecification();
                    BeanUtils.copyProperties(billingCycleSpecificationRef, billingCycleSpecification);
                    return billingCycleSpecification;
                })
                .flatMapMany(Flux::just);
    }

}
