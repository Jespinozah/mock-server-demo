package org.example;

import org.mockserver.integration.ClientAndServer;

import static org.mockserver.integration.ClientAndServer.startClientAndServer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClientAndServer mockServer = startClientAndServer(1080);
    }
}
