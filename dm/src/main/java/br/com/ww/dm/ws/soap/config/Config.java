package br.com.ww.dm.ws.soap.config;

//import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import br.com.ww.dm.ws.generated.IterfaceServico;

/**
 * @author William Lima (wwlima@gmail.com)
 *
 */
@Configuration
public class Config {
	
	@Value("${webservice.client.url}")
	private String urlServico;
 
//	@Bean
//	public IterfaceServico servicoClient() {
//		JaxWsProxyFactoryBean clientFactory = new JaxWsProxyFactoryBean();
//		clientFactory.setServiceClass(IterfaceServico.class);
//		clientFactory.setAddress(urlServico);
//		return (IterfaceServico) clientFactory.create();
//	}
	
}
