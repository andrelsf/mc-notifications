package br.dev.multicode.mcnotifications.services.impl;

import br.dev.multicode.mcnotifications.enums.NotificationType;
import br.dev.multicode.mcnotifications.services.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SMSNotificationImpl implements NotificationService {

  private static final Logger log = LoggerFactory.getLogger(SMSNotificationImpl.class);

  @Override
  public boolean supports(NotificationType notificationType) {
    return NotificationType.SMS.equals(notificationType);
  }

  @Override
  public void send(String Message) {
    log.info("SMS sent successfully");
  }
}
