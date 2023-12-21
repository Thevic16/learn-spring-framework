package com.vgomez.spring.learnspringframework;

import com.vgomez.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.vgomez.spring.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();

		//GamingConsole game = new MarioGame(); //1
		//GameRunner runner = new GameRunner(game); //2

		ConfigurableApplicationContext context
				= SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
