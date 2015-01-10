package media_msgs;

public interface StateData extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/StateData";
  static final java.lang.String _DEFINITION = "## State data media message\n## Common state of media connected object\n\nHeader header\n\n# State    0: Unknown, 1: Init, 2: Enable, 3: Shutdown\nuint32 state\n\n# Input    (tv/tuner, player, ext1, HDMI3, VGA, HP, ext...)\nMonitorInfo monitor\n\n# Audio data\nSpeakerInfo speaker\n\n# Player data\nPlayerInfo player\n\nuint32 UNKNOWN=0\nuint32 INIT=1\nuint32 ENABLE=2\nuint32 SHUTDOWN=3";
  static final int UNKNOWN = 0;
  static final int INIT = 1;
  static final int ENABLE = 2;
  static final int SHUTDOWN = 3;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  int getState();
  void setState(int value);
  media_msgs.MonitorInfo getMonitor();
  void setMonitor(media_msgs.MonitorInfo value);
  media_msgs.SpeakerInfo getSpeaker();
  void setSpeaker(media_msgs.SpeakerInfo value);
  media_msgs.PlayerInfo getPlayer();
  void setPlayer(media_msgs.PlayerInfo value);
}
