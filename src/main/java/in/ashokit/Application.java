package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Player;
import in.ashokit.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
	
	Player p1=new Player();
	p1.setPlayerid(101);
	p1.setPlayerName("Raghav");
	p1.setPlayerage(42);
	playerRepository.save(p1);
	}

}
