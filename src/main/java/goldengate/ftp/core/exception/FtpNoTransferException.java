/**
 * Copyright 2009, Frederic Bregier, and individual contributors
 * by the @author tags. See the COPYRIGHT.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3.0 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package goldengate.ftp.core.exception;

/**
 * No transfer exception
 *
 * @author Frederic Bregier
 *
 */
public class FtpNoTransferException extends Exception {

    /**
	 *
	 */
    private static final long serialVersionUID = 977343700748516315L;

    /**
     * @param message
     */
    public FtpNoTransferException(String message) {
        super(message);
    }

    /**
     * @param message
     * @param cause
     */
    public FtpNoTransferException(String message, Throwable cause) {
        super(message, cause);
    }

}