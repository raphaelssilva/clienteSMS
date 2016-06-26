package biz.r2s.sms.admin;

class FaixaDePreco {
 
	int faixaInicial
	 
	int faixaFinal
	 
	float valor
	 
	static belongsTo = [tabelaPreco:TabelaPreco]
	 
}
 
