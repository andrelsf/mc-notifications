package br.dev.multicode.mcnotifications.services;

import br.dev.multicode.mcnotifications.enums.NotificationType;
import org.springframework.plugin.core.Plugin;

public interface NotificationService extends Plugin<NotificationType> {

  void send(String Message);

}
