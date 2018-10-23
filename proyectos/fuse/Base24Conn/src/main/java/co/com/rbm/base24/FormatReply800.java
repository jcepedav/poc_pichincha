package co.com.rbm.base24;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FormatReply800 implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String salida = exchange.getIn().getBody().toString();
		int longitud;
		salida = salida.substring(2, 12) + "04081082200000020000000400000000000000" + salida.substring(50, 66) + "00" + salida.substring(66, 69);
		longitud = salida.length();
		salida = Character.toString((char)0x00) + Character.toString((char)longitud) +  salida;
		exchange.getOut().setBody(salida);
	}

}
