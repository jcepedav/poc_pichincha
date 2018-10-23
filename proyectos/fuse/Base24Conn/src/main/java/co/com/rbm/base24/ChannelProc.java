package co.com.rbm.base24;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.netty4.NettyConstants;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.Channel;
import org.apache.camel.Message;

public class ChannelProc implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		Message m = ex.getIn();
		ChannelHandlerContext c = (ChannelHandlerContext) m.getHeader("CamelNettyChannelHandlerContext");
		Channel channel = c.channel();
		ex.setProperty(NettyConstants.NETTY_CHANNEL, channel);
	}

}
