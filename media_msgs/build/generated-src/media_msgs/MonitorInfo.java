package media_msgs;

public interface MonitorInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/MonitorInfo";
  static final java.lang.String _DEFINITION = "## Statedata components\n## sub-type of Monitor capability\n\n# Resolution width x height in pixel\nuint32 height\nuint32 wigth\n\n# Source of stream (video/image/channel)\nstring source";
  int getHeight();
  void setHeight(int value);
  int getWigth();
  void setWigth(int value);
  java.lang.String getSource();
  void setSource(java.lang.String value);
}
