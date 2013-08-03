package br.com.fiap.loja;



// TODO: Auto-generated Javadoc
/**
 * MoedaEstrangeira: responsavel pela conversao da moeda americana.
 * @author Ricardo Fontanelli
 * @
 */
public class MoedaEstrangeira {

	/**
	 * Converter dolar.
	 *
	 * @param valor valor em dolar
	 * @return the int valor em real
	 */
	public int converterDolar(int valor){
		
		if(valor < 0){
			return 0;
		}
		else{
			return valor * 2;	
		}
	}
	
}
