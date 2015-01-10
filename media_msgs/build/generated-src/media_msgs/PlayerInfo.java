package media_msgs;

public interface PlayerInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/PlayerInfo";
  static final java.lang.String _DEFINITION = "## Statedata components\n## sub-type of Player capability\n\n# State    0: Unknown, 1: stop, 2: play, 3: pause, 4: fastforward, 5: fastbackward, 6: moveto\nuint32 state\n\n# Speed play (or forward / reverse)\nint32 speed\n\n# Position\nduration stamp\nduration totaltime\n\nbool canseek\nbool subtitleenabled\nint32 mediaid\nMediaType mediatype\n\nstring title\nstring file\nstring thumbnail";
  int getState();
  void setState(int value);
  int getSpeed();
  void setSpeed(int value);
  org.ros.message.Duration getStamp();
  void setStamp(org.ros.message.Duration value);
  org.ros.message.Duration getTotaltime();
  void setTotaltime(org.ros.message.Duration value);
  boolean getCanseek();
  void setCanseek(boolean value);
  boolean getSubtitleenabled();
  void setSubtitleenabled(boolean value);
  int getMediaid();
  void setMediaid(int value);
  media_msgs.MediaType getMediatype();
  void setMediatype(media_msgs.MediaType value);
  java.lang.String getTitle();
  void setTitle(java.lang.String value);
  java.lang.String getFile();
  void setFile(java.lang.String value);
  java.lang.String getThumbnail();
  void setThumbnail(java.lang.String value);
}
