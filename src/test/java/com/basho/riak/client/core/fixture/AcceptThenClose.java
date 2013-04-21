/*
 * Copyright 2013 Basho Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.basho.riak.client.core.fixture;

import com.basho.riak.client.core.Protocol;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;

/**
 *
 * @author Brian Roach <roach at basho dot com>
 */
public class AcceptThenClose extends Acceptor
{

    public AcceptThenClose(ServerSocketChannel server, Protocol protocol)
    {
        super(server, protocol);
        this.type = AcceptorType.ACCEPT_THEN_CLOSE;
    }
    
    @Override
    Acceptor duplicate()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    boolean writeHttp(SelectionKey key) throws IOException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    boolean writePb(SelectionKey key) throws IOException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
