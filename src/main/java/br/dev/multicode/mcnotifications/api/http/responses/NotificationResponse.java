package br.dev.multicode.mcnotifications.api.http.responses;

public class NotificationResponse {

  private String status;

  public NotificationResponse() {
  }

  public NotificationResponse(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
