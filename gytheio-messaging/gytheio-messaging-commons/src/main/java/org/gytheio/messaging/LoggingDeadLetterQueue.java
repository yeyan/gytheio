/*
 * Copyright (C) 2005-2014 Alfresco Software Limited.
 *
 * This file is part of Gytheio
 *
 * Gytheio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Gytheio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Gytheio. If not, see <http://www.gnu.org/licenses/>.
 */
package org.gytheio.messaging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Endpoint which simply logs dead letter messages
 * 
 * @author Ray Gauss II
 */
public class LoggingDeadLetterQueue
{
    private static final Log logger = LogFactory.getLog(LoggingDeadLetterQueue.class);

    public void onReceive(Object message)
    {
        if (logger.isDebugEnabled() && message != null)
        {
            logger.debug("Received:\n\n" + message.toString() + "\n\n");
        }
    }

}
