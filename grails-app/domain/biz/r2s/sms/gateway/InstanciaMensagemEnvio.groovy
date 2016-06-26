package biz.r2s.sms.gateway

import biz.r2s.util.Telefone;

class InstanciaMensagemEnvio {
 
	Date dataEnvio;
	StatusMensagem statusMensagem;
	
	static belongsTo = [gateway:Gateway, mensagemEnvio:MensagemEnvio, destinatario:Telefone]
	
	static mapping = {
		statusMensagem enumType:'string'
	}
	
	public enum StatusMensagem
	{
		PROCESSANDO,
		ENVIANDO,
		ENVIADA,
		CANCELADA,
		RECEBIDA,
		NAO_RECEBIDA,
		NUMERO_VAZIO,
		NUMERO_INVALIDO,
		MENSAGEM_NULA,
		MENSAGEM_INVALIDA,
		FALHA_NO_GATEWAY;

	}

	 
}
 
