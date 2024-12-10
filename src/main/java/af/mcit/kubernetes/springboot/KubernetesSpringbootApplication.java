package af.mcit.kubernetes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetesSpringbootApplication {

	@GetMapping("/loop")
	public String forLoop(){
		for(int i=1; i<=1000; i++){
			System.out.println(i);
		}
		return "looped 1000 times";
	}

	public static void main(String[] args) {
		SpringApplication.run(KubernetesSpringbootApplication.class, args);
	}

}
