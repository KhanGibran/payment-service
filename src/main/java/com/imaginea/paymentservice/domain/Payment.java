package com.imaginea.paymentservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class Payment{
	private Long paymentDate;
	private PaymentStatus paymentStatus;

	public Payment(){
		this.paymentDate = Instant.now().toEpochMilli();
		this.paymentStatus = PaymentStatus.PAYMENT_SUCCESS;
	}
}
