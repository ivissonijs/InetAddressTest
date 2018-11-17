package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "www.goole.com";                                      //String name = "www.goole.com";
            InetAddress address = InetAddress.getAllName(name);                 //etAddress address = InetAddress.getByName(name); 
            for(InetAddress addr:address){                                      //System.out.println( "Name:      "+ name);
            System.out.println( "Address:   "+ addr.getHostAddress());          //System.out.println( "Address:   "+ address.getHostAddress());
            }
        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
