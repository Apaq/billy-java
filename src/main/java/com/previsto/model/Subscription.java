package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.previsto.BillyClient.EPOCH;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author michael
 */
public class Subscription extends Entity {
    
    
    
    private Long customerId;
    private Integer nextRunDateDays;
    private Integer startDateDays;
    private Integer endDateDays;
    private Long customerContextId;
    private String description;
    private String details;
    private String invoiceEmail;
    private Dimensions dimensions;
    private TermsOfPayment termsOfPayment = new TermsOfPayment();
    @JsonProperty("isActive")
    private boolean active;
    private int interval = 1;
    private IntervalType intervalType = IntervalType.Months;
    private String intervalDescription;
    private Integer partnerAccountNumber;
    private String partnerName;
    private String partnerPhoneNumber;
    private Long subscriptionTicketId;
    private Totals totals = new Totals();
    
    @JsonIgnore
    private List<SubscriptionLine> subscriptionLines = new ArrayList<>();
    
    @JsonIgnore
    private List<SubscriptionInvoice> invoices = new ArrayList<>();

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @JsonIgnore
    public LocalDate getNextRunDate() {
        return LocalDate.of(1970, Month.JANUARY, 1).plusDays(nextRunDateDays);
    }

    public Integer getNextRunDateDays() {
        return nextRunDateDays;
    }
    
    public void setNextRunDate(LocalDate date) {
        if(date == null) {
            this.startDateDays = null;
        } else {
            this.nextRunDateDays = (int) ChronoUnit.DAYS.between(EPOCH, date);
        }
    }

    public void setNextRunDateDays(Integer nextRunDateDays) {
        this.nextRunDateDays = nextRunDateDays;
    }

    public Integer getStartDateDays() {
        return startDateDays;
    }
    
    @JsonIgnore
    public LocalDate getStartDate() {
        return LocalDate.of(1970, Month.JANUARY, 1).plusDays(startDateDays);
    }
    
    public void setStartDate(LocalDate date) {
        if(date == null) {
            this.startDateDays = null;
        } else {
            this.startDateDays = (int) ChronoUnit.DAYS.between(EPOCH, date);
        }
        
    }

    public void setStartDateDays(Integer startDateDays) {
        this.startDateDays = startDateDays;
    }

    @JsonIgnore
    public LocalDate getEndDate() {
        return LocalDate.of(1970, Month.JANUARY, 1).plusDays(endDateDays);
    }
    
    public Integer getEndDateDays() {
        return endDateDays;
    }

    public void setEndDate(LocalDate date) {
        if(date == null) {
            this.endDateDays = null;
        } else {
            this.endDateDays = (int) ChronoUnit.DAYS.between(EPOCH, date);
        }
    }
    
    public void setEndDateDays(Integer endDateDays) {
        this.endDateDays = endDateDays;
    }

    public Long getCustomerContextId() {
        return customerContextId;
    }

    public void setCustomerContextId(Long customerContextId) {
        this.customerContextId = customerContextId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getInvoiceEmail() {
        return invoiceEmail;
    }

    public void setInvoiceEmail(String invoiceEmail) {
        this.invoiceEmail = invoiceEmail;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public TermsOfPayment getTermsOfPayment() {
        return termsOfPayment;
    }

    public void setTermsOfPayment(TermsOfPayment termsOfPayment) {
        this.termsOfPayment = termsOfPayment;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public IntervalType getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(IntervalType intervalType) {
        this.intervalType = intervalType;
    }

    public String getIntervalDescription() {
        return intervalDescription;
    }

    public void setIntervalDescription(String intervalDescription) {
        this.intervalDescription = intervalDescription;
    }

    public Integer getPartnerAccountNumber() {
        return partnerAccountNumber;
    }

    public void setPartnerAccountNumber(Integer partnerAccountNumber) {
        this.partnerAccountNumber = partnerAccountNumber;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerPhoneNumber() {
        return partnerPhoneNumber;
    }

    public void setPartnerPhoneNumber(String partnerPhoneNumber) {
        this.partnerPhoneNumber = partnerPhoneNumber;
    }

    public Long getSubscriptionTicketId() {
        return subscriptionTicketId;
    }

    public void setSubscriptionTicketId(Long subscriptionTicketId) {
        this.subscriptionTicketId = subscriptionTicketId;
    }

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }

    public List<SubscriptionLine> getSubscriptionLines() {
        return subscriptionLines;
    }

    public void setSubscriptionLines(List<SubscriptionLine> subscriptionLines) {
        this.subscriptionLines = subscriptionLines;
    }

    public List<SubscriptionInvoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<SubscriptionInvoice> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
    
    
   
}
