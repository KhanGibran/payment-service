package com.imaginea.paymentservice.service;

import com.imaginea.paymentservice.domain.Payment;
import com.imaginea.paymentservice.domain.PaymentStatus;

import java.util.Map;

public interface PaymentService {
	PaymentStatus doPayment(String bookingId);

	Map<String, Payment> getPaymentDetails();
}
