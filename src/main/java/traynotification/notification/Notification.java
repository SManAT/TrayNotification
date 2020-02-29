package traynotification.notification;

public enum Notification{
  INFORMATION("images/info.png", "#2C54AB"),
  NOTICE("images/notice.png", "#f6e606"),
  SUCCESS("images/success.png", "#009961"),
  WARNING("images/warning.png", "#E23E0A"),
  ERROR("images/error.png", "#CC0033");

  private final String urlResource;
  private final String paintHex;

  Notification(String urlResource, String paintHex) {
    this.urlResource = urlResource;
    this.paintHex = paintHex;
  }

  public String getURLResource() {
    return urlResource;
  }

  public String getPaintHex() {
    return paintHex;
  }

}
