package com.evaldo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.evaldo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}