package br.dev.multicode.mcnotifications;

import br.dev.multicode.mcnotifications.services.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@SpringBootApplication
@EnablePluginRegistries({ NotificationService.class })
public class McNotificationsApplication {

  public static void main(String[] args) {
    SpringApplication.run(McNotificationsApplication.class, args);
  }

}
