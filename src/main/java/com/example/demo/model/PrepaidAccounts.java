package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "prepaid_accounts")
@Data
public class PrepaidAccounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "msisdn")
    private String msisdn;

    @Column(name = "cs_voice_call_seconds")
    private Long csVoiceCallSeconds;

    @Column(name = "4g_data_octets")
    private Integer fourGDataOctets;

    @Column(name = "5g_data_octets")
    private Integer fiveGDataOctets;

    @Column(name = "volte_call_seconds")
    private Long volteCallSeconds;

    @Column(name = "total_data_octets_available")
    private Long totalDataOctetsAvailable;

    @Column(name = "total_input_data_octets_available")
    private Long totalInputDataOctetsAvailable;

    @Column(name = "total_output_data_octets_available")
    private Long totalOutputDataOctetsAvailable;

    @Column(name = "total_data_octets_consumed")
    private Long totalDataOctetsConsumed;

    @Column(name = "total_call_seconds_available")
    private Long totalCallSecondsAvailable;

    @Column(name = "total_call_seconds_consumed")
    private Long totalCallSecondsConsumed;

    @Column(name = "total_sms_available")
    private Long totalSmsAvailable;

    @Column(name = "total_sms_consumed")
    private Long totalSmsConsumed;
}
