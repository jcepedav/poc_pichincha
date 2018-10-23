package co.com.rbm.base24;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AddInitalLength implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String salida = exchange.getIn().getBody().toString();
		int longitud;
		byte b1, b2;
		longitud = salida.length();
		
		b1 = (byte)((longitud & 0xff00) >> 8);
		b2 = (byte)(longitud & 0xff);
		
		salida = Character.toString((char)0x01) + Character.toString((char)0x33) + salida;
		exchange.getOut().setBody(salida);
	}
}
