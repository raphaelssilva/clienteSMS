package biz.r2s.sms.admin;

class TabelaPreco {
 
	String nome
	
	String descricao;
	
	static hasMany = [faixaDePreco:FaixaDePreco] 
}
 
