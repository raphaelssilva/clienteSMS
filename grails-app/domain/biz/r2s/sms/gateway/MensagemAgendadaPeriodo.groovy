package biz.r2s.sms.gateway

class MensagemAgendadaPeriodo extends MensagemAgendada {
 
	int numeroDeRepeticao;
	 
	static belongsTo = [unidadePeriodo:UnidadePeriodo, tipoPeriodo:TipoPeriodo]
	
	static mapping = {
		tipoPeriodo enumType:'string'
		unidadePeriodo enumType:'string'
	}
	
	
	enum UnidadePeriodo{		
		SEGUNDO,
		MINUTO,
		HORA,
		DIA,
		MES,
		ANO;
		
	}
	
	enum TipoPeriodo{
		SEMANA;
	}
	
}
 
