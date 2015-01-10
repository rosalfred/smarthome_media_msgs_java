package media_msgs;

public interface ToggleMuteSpeakerResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/ToggleMuteSpeakerResponse";
  static final java.lang.String _DEFINITION = "bool state";
  boolean getState();
  void setState(boolean value);
}
