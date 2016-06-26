package biz.r2s.sms.gateway

import biz.r2s.security.Usuario;

public class Mensagem {
 
	String textoMensagem;
	Date dataDeCriacao;
	
	static belongsTo = [usuario:UsuarioGateway]
	 
}
 
