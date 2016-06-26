package biz.r2s.sms.gateway

class MensagemAgendada extends Mensagem {
 
	Date dataAgendamento;
	boolean isAtiva;
	
	static belongsTo = [mensagemEnvio:MensagemEnvio]
	 
}
 
