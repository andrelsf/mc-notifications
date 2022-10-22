package br.dev.multicode.mcnotifications.services.impl;

import br.dev.multicode.mcnotifications.enums.NotificationType;
import br.dev.multicode.mcnotifications.services.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EMAILNotificationImpl implements NotificationService {

  private static final Logger log = LoggerFactory.getLogger(EMAILNotificationImpl.class);

  @Override
  public String send(String Message) {
    log.info("EMAIL sent successfully");
    return "EMAIL sent successfully";
  }

  @Override
  public boolean supports(NotificationType notificationType) {
    return NotificationType.EMAIL.equals(notificationType);
  }
}
