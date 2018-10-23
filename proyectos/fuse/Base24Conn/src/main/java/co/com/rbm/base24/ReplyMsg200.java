package co.com.rbm.base24;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.com.rbm.esb.TipoInfoRespuesta;
import co.com.rbm.esb.TipoInfoUbicacion;
import co.com.rbm.esb.comercio.TipoInfoPuntoInteraccion;
import co.com.rbm.esb.comercio.TipoInfoTerminal;
import co.com.rbm.esb.comercio.TipoTipoTerminal;
import co.com.rbm.esb.comercio.compra.TipoCabeceraSolicitud;
import co.com.rbm.esb.comercio.compra.TipoInfoCompraResp;
import co.com.rbm.esb.comercio.compra.TipoRespuesta;

public class ReplyMsg200 implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String bitmap = exchange.getIn().getBody(String.class);

		TipoRespuesta response = new TipoRespuesta();
		TipoCabeceraSolicitud cabecera = new TipoCabeceraSolicitud();
			TipoInfoPuntoInteraccion infoPunto = new TipoInfoPuntoInteraccion();
		TipoInfoRespuesta respues = new TipoInfoRespuesta();
		TipoInfoTerminal terminal = new TipoInfoTerminal();
			TipoInfoUbicacion ubica = new TipoInfoUbicacion();
		TipoInfoCompraResp infoCompra = new TipoInfoCompraResp();

		
		response.setCabeceraRespuesta(cabecera);
		response.setInfoCompraResp(infoCompra);
		response.setInfoTerminal(terminal);
		response.setInfoRespuesta(respues);
		response.setIdTransaccionAutorizador(Long.valueOf(0));
		
		if(bitmap == null)
		{
			throw new Exception("TIMEOUT");
		} else {
			bitmap = bitmap.substring(1);
	
			Long idTransaccion = Long.valueOf(bitmap.substring(131,148));
			
			response.setIdTransaccionAutorizador(idTransaccion);
			
			GregorianCalendar c = new GregorianCalendar(
					2017, // year
					Integer.parseInt(bitmap.substring(93,95)) - 1, // Month 
					Integer.parseInt(bitmap.substring(95,97))); // Day
			XMLGregorianCalendar posteo = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	
			GregorianCalendar cd = new GregorianCalendar(
					2017, // year
					Integer.parseInt(bitmap.substring(89,91)) - 1, // Month 
					Integer.parseInt(bitmap.substring(91,93)), // Day
					Integer.parseInt(bitmap.substring(83,85)), // Hour
					Integer.parseInt(bitmap.substring(85,87)), // Minute
					Integer.parseInt(bitmap.substring(87,89))); // Second
			
			XMLGregorianCalendar transDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cd);
			
			cabecera.setInfoPuntoInteraccion(infoPunto);
			
			infoPunto.setIdAdquiriente(exchange.getIn().getHeader("IdAdquiriente", String.class)); // Set header Adquiriente
			infoPunto.setIdTerminal(bitmap.substring(156, 164));
			infoPunto.setIdTransaccionTerminal(Long.valueOf(bitmap.substring(131,148)));
			infoPunto.setTipoTerminal(TipoTipoTerminal.WEB);
			
			respues.setCodRespuesta(bitmap.substring(154, 156));
			respues.setCodRespuesta(bitmap.substring(154, 156)); // TODO: Extraer
			respues.setCodRespuesta(bitmap.substring(154, 156)); // TODO: Extraer
			
			ubica.setCiudad(bitmap.substring(209, 222));
			ubica.setDepartamento(bitmap.substring(222, 225));
			ubica.setPais(bitmap.substring(225, 227));
			terminal.setInfoUbicacion(ubica);
			
			infoCompra.setCostoTransaccion(BigDecimal.valueOf(Long.valueOf(bitmap.substring(55,67))));
			infoCompra.setFechaPosteo(posteo);
			infoCompra.setFechaTransaccion(transDate);
			infoCompra.setNumAprobacion(bitmap.substring(148,154));
		}
		exchange.getIn().setBody(response);
	}

}
