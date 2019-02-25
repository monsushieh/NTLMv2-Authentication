package com.marcelkliemannel.java_ntlmv2_authentication_example.client;

import org.eclipse.jetty.client.HttpClient;

/**
 * Minimal client instance to make a NTLMv2 authentication request.
 */
public class ClientStart 
{
    // ---- Public Methods
    public static void main(String[] args) throws Exception
    {
        HttpClient httpClient = null;
        try 
        {
            // New Http Client
            httpClient = new HttpClient();
            httpClient.start();

            // New NTLMv2 Client Side Handler
            NTLMv2ClientSideHandler ntlMv2ClientSideHandler = new NTLMv2ClientSideHandler(httpClient);
            ntlMv2ClientSideHandler.authenticate();
        }
        finally 
        {
            // Process httpClient
            if (httpClient != null)
            {
                httpClient.stop();
            }
        }
    }
}
