package biz.r2s.sms.client

import biz.r2s.sms.gateway.UsuarioGateway;

class GrupoContato {

	String nome
	
	String descricao
	
	static hasMany = [contatos:Contato]
	
	static belongsTo = [usuario:UsuarioGateway]
	
}
