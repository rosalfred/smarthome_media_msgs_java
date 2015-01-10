package media_msgs;

public interface KeyValue extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/KeyValue";
  static final java.lang.String _DEFINITION = "string key # what to label this value when viewing\nstring value # a value to track over time\nbool multi # if value is array of value";
  java.lang.String getKey();
  void setKey(java.lang.String value);
  java.lang.String getValue();
  void setValue(java.lang.String value);
  boolean getMulti();
  void setMulti(boolean value);
}
