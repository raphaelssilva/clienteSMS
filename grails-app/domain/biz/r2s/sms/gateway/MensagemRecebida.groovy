package biz.r2s.sms.gateway

class MensagemRecebida extends Mensagem {
 
	Date dataMensagemRecebida;
	
	static belongsTo = [promocao:Promocao]
	 
}
 
