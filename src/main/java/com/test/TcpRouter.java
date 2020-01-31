package com.test;
import org.apache.camel.builder.RouteBuilder;


public class TcpRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		 from("netty:tcp://localhost:7000?allowDefaultCodec=false&encoder=#stringEncoder&decoder=#stringDecoder&sync=false")
		 .to("bean:echoService");
	}

}
