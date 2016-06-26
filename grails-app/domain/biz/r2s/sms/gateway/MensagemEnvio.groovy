package biz.r2s.sms.gateway

class MensagemEnvio extends Mensagem {
 
	Date dataInicioEnvio;
	static hasMany = [instanciaMensagemEnvio:InstanciaMensagemEnvio]
	 
}
 
