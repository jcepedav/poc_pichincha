package co.com.rbm.base24;

import io.netty.channel.ChannelHandlerContext;

public class DataContainerBean {
	private ChannelHandlerContext channel;

	public ChannelHandlerContext getChannel() {
		return channel;
	}

	public void setChannel(ChannelHandlerContext channel) {
		this.channel = channel;
	}
	
}
