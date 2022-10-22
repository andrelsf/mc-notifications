package br.dev.multicode.mcnotifications.api.resources;

import br.dev.multicode.mcnotifications.api.http.requests.PostNotificationRequest;
import br.dev.multicode.mcnotifications.enums.NotificationType;
import br.dev.multicode.mcnotifications.services.NotificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
  value = "/notifications",
  produces = MediaType.APPLICATION_JSON_VALUE,
  consumes = MediaType.APPLICATION_JSON_VALUE)
public class NotificationResource {

  private final PluginRegistry<NotificationService, NotificationType> notificationServices;

  public NotificationResource(
      PluginRegistry<NotificationService, NotificationType> notificationServices)
  {
    this.notificationServices = notificationServices;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void postNotifications(@RequestBody PostNotificationRequest postNotificationRequest) {
    notificationServices.getRequiredPluginFor(postNotificationRequest.getNotificationType())
        .send(postNotificationRequest.getMessage());
  }
}
