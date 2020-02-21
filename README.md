# Tray Notification

_Tray Notification_ is a library for JavaFX that adds easy-to-use tray notifications for desktop computers. <br/>
This is a fork to comply my needs.<br/>
A CSS File is added to style the notification.<br>
It is a gradle Project.

```java
String title = "Congratulations sir";
String message = "You've successfully created your first Tray Notification";
TrayNotification tray = new TrayNotification();
tray.setTitle(title);
tray.setMessage(message);
tray.setNotification(Notification.SUCCESS);
tray.setAnimation(Animations.POPUP);
tray.showAndDismiss(Duration.seconds(1));
```
