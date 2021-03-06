/**
 * This file is part of Waarp Project.
 * 
 * Copyright 2009, Frederic Bregier, and individual contributors by the @author tags. See the
 * COPYRIGHT.txt in the distribution for a full listing of individual contributors.
 * 
 * All Waarp Project is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * Waarp is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with Waarp . If not, see
 * <http://www.gnu.org/licenses/>.
 */
package org.waarp.ftp.core.control;

import java.nio.charset.Charset;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.string.StringDecoder;

/**
 * Exactly same as StringDecoder from Netty
 * 
 * @author Frederic Bregier
 * 
 */
public class FtpControlStringDecoder extends StringDecoder {
	/**
	 *
	 */
	public FtpControlStringDecoder() {
	}

	/**
	 * @see StringDecoder
	 * @param arg0
	 */
	public FtpControlStringDecoder(String arg0) {
		super(Charset.forName(arg0));
	}

	/**
	 * @see StringDecoder
	 * @param arg0
	 */
	public FtpControlStringDecoder(Charset arg0) {
		super(arg0);
	}

	/*
	 * (non-Javadoc)
	 * @see org.jboss.netty.handler.codec.string.StringDecoder#decode(org.jboss.netty
	 * .channel.ChannelHandlerContext, org.jboss.netty.channel.Channel, java.lang.Object)
	 */
	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel,
			Object msg) throws Exception {
		return super.decode(ctx, channel, msg);
	}
}
