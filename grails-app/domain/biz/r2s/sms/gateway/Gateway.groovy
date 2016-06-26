package biz.r2s.sms.gateway

import biz.r2s.util.Telefone;

class Gateway extends Telefone{
 
	String nome;
	String porta;
	String velocidade;
	String marca;
	String modelo;
	int pin;
	boolean temCaixaEntrada;
	boolean temCaixaSaida;	
	 
	static hasMany = [promocoes:Promocao, instanciaMensagemEnvios:InstanciaMensagemEnvio, mensagemAgendadas:MensagemAgendada]
	
}
 
