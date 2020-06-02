package com.imaginea.paymentservice.controller;

import com.imaginea.paymentservice.domain.Payment;
import com.imaginea.paymentservice.domain.PaymentStatus;
import com.imaginea.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/payment/api")
public class PaymentController{

	@Autowired
	private PaymentService paymentService;

	@GetMapping("/book/{bookingId}/pay")
	public PaymentStatus pay(@PathVariable(value = "bookingId") String bookingId){
		return paymentService.doPayment(bookingId);
	}

	@GetMapping("/details")
	public Map<String, Payment> getPaymentDetails(){
		return paymentService.getPaymentDetails();
	}
}