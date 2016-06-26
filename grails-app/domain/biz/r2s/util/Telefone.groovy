package biz.r2s.util
class Telefone{
	Long numero
	String descricao
	Integer ddd
	Integer ramal
	Integer codPais
	
	static belongsTo = [pessoa:Pessoa]
}

