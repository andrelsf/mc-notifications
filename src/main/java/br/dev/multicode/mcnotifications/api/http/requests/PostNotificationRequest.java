package br.dev.multicode.mcnotifications.api.http.requests;

import br.dev.multicode.mcnotifications.enums.NotificationType;

public class PostNotificationRequest {

  private String message;
  private NotificationType notificationType;

  public PostNotificationRequest() {
  }

  public PostNotificationRequest(String message, NotificationType notificationType) {
    this.message = message;
    this.notificationType = notificationType;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public NotificationType getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
  }
}
