package biz.r2s.sms.gateway;

import biz.r2s.util.Telefone;

class TelefonePromocaoAutorizado extends Telefone {
 
	String descricao;
	boolean podeParticipar;
	
	static belongsTo = [promocao:Promocao]
	 
}
 
