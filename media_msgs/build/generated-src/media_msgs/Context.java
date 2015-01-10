package media_msgs;

public interface Context extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/Context";
  static final java.lang.String _DEFINITION = "## Context concept media message\n\n# User, Machine, Object initialize the command\nstring who\n\n# Place (eq. Works, home... view than a channel)\nstring where";
  java.lang.String getWho();
  void setWho(java.lang.String value);
  java.lang.String getWhere();
  void setWhere(java.lang.String value);
}
