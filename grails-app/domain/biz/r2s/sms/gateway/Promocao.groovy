package biz.r2s.sms.gateway

import biz.r2s.security.Usuario;

class Promocao {
 
	String codigo;
	String descricao;
	Date dataInicio;
	Date dataFim;
	boolean isAtivo;
	
	static beLongsTo = [gateway:Gateway, usuario:UsuarioGateway];
	
	static hasMany = [mensagemRecebida:MensagemRecebida, telefonePromocaoAutorizado:TelefonePromocaoAutorizado];
	 
}
 
