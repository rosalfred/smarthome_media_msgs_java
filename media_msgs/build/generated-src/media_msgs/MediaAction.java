package media_msgs;

public interface MediaAction extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/MediaAction";
  static final java.lang.String _DEFINITION = "## Mapped to Android Intent\n## Centric point of view of Connected Object\n##  Sample :\n##   - Android SmartPhone\n##   - Android Tablet\n##   - Android TV or API TV\n##   - XBMC\n##   - ..;\n\n# action to sub-type (player, sound, monitor)\nstring method\n\n# Sub-type (player, sound, monitor)\nstring type\n\n# Path ressource file/content\nstring uri\n\n# Payload data\nstring[] data";
  java.lang.String getMethod();
  void setMethod(java.lang.String value);
  java.lang.String getType();
  void setType(java.lang.String value);
  java.lang.String getUri();
  void setUri(java.lang.String value);
  java.util.List<java.lang.String> getData();
  void setData(java.util.List<java.lang.String> value);
}
