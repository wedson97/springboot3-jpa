package com.wedson.aula.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wedson.aula.entities.Pedido;
import com.wedson.aula.entities.User;
import com.wedson.aula.entities.enums.PedidoStatus;
import com.wedson.aula.repositories.PedidoRepository;
import com.wedson.aula.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u1,PedidoStatus.AGUARDANDO_PAGAMENTO);
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), u2,PedidoStatus.PAGO);
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), u1,PedidoStatus.CANCELADO);

		userRepository.saveAll(Arrays.asList(u1, u2));
		pedidoRepository.saveAll(Arrays.asList(o1,o2,o3));
	}

}
