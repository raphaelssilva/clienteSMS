package biz.r2s.sms.gateway

import biz.r2s.security.Usuario;

class UsuarioGateway extends Usuario {
 
	
	static belongsTo = [mensagenAgendada:MensagemAgendada]
	
	static hasMany = [promocao:Promocao, mensagem:Mensagem]
	 
}
 
