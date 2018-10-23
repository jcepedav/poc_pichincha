package co.com.rbm.base24;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.com.rbm.esb.comercio.compra.TipoSolicitudCompra;


public class ParceMsg200 implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		TipoSolicitudCompra tipocompra = exchange.getIn().getBody(TipoSolicitudCompra.class);
		SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
		String bitmap;
		exchange.getOut().setHeader("IdAdquiriente", tipocompra.getCabeceraSolicitud().getInfoPuntoInteraccion().getIdAdquiriente());
		bitmap = Character.toString((char)0x01) + Character.toString((char)0x33) + 
	    "ISO0260000500200b020840028c204020000000000000080003000" + 
	    String.format("%012d", tipocompra.getInfoCompra().getMontoTotal().longValue()) + // len 12
	    String.format("%06d", tipocompra.getCabeceraSolicitud().getInfoPuntoInteraccion().getIdTransaccionTerminal()) + // len 6
		sdf.format(new Date()) + // len 4
		"01737" +
		tipocompra.getInfoMedioPago().getIdTarjetaCredito().getNumTarjeta() + // len 16
		"D" +
		sdf.format(tipocompra.getInfoMedioPago().getIdTarjetaCredito().getFechaExpiracion().toGregorianCalendar().getTime()) + // len 4
		"00000000" +
		String.format("%3s", tipocompra.getInfoMedioPago().getIdTarjetaCredito().getCodVerificacion()) + // len 3
		"00000" +
		String.format("%012d", tipocompra.getCabeceraSolicitud().getInfoPuntoInteraccion().getIdTransaccionTerminal()) + // len 12
		String.format("%6s", tipocompra.getCabeceraSolicitud().getInfoPuntoInteraccion().getIdTerminal()) + // len 6
		"        020000000000   036000000000000000000000000000000000000012000000000000066& 0000300066! QG00008 0A100000! QB00026 " +
		"Compra HISO FUSE          020                    ";
		exchange.getOut().setBody(bitmap);
	}

}
