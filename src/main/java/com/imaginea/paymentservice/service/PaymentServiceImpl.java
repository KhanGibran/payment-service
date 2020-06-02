package com.imaginea.paymentservice.service;

import com.imaginea.paymentservice.domain.Payment;
import com.imaginea.paymentservice.domain.PaymentStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {

	private static Map<String,Payment> paymentDetails = new HashMap<>();

	@Override
	public PaymentStatus doPayment(String bookingId){
		Payment payment = new Payment();
		paymentDetails.put(bookingId,payment);
		return payment.getPaymentStatus();
	}

	@Override
	public Map<String, Payment> getPaymentDetails() {
		return paymentDetails;
	}
}
