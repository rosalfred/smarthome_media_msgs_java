package media_msgs;

public interface Command extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/Command";
  static final java.lang.String _DEFINITION = "## Command concept media message\n\n# Context\nContext context\n\n# what you want\nstring action\n\n# What is it\nstring subject";
  media_msgs.Context getContext();
  void setContext(media_msgs.Context value);
  java.lang.String getAction();
  void setAction(java.lang.String value);
  java.lang.String getSubject();
  void setSubject(java.lang.String value);
}
