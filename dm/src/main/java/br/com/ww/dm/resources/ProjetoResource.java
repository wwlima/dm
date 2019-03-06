/**
 * 
 */
package br.com.ww.dm.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author William Wilson Carvalho de Lima (wwlima@gmail.com)
 * @since 28/02/2019 
 */

@RestController
@RequestMapping(value="/dm/projetos")
public class ProjetoResource {

	@GetMapping(value="/ping")
	public boolean ping () { 
		return true;
	}
	
}
