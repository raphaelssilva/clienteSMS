package biz.r2s.sms.client

import biz.r2s.util.PessoaFisica;

class Contato extends PessoaFisica{
	
	Date dataCadastro

	static belongsTo = [grupoContato:GrupoContato]
}
