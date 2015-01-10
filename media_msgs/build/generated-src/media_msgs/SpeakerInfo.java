package media_msgs;

public interface SpeakerInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/SpeakerInfo";
  static final java.lang.String _DEFINITION = "## Statedata components\n## sub-type of Speaker capability\n\n# Output \nuint32 output\n\n# Level (in decibel SPL)\nuint32 level\n\n# Muted\nbool muted\n\n# Channel\nstring channel\n\n# Source of stream\nstring source\n\n";
  int getOutput();
  void setOutput(int value);
  int getLevel();
  void setLevel(int value);
  boolean getMuted();
  void setMuted(boolean value);
  java.lang.String getChannel();
  void setChannel(java.lang.String value);
  java.lang.String getSource();
  void setSource(java.lang.String value);
}
