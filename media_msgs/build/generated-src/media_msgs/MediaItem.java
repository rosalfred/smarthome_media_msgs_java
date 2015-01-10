package media_msgs;

public interface MediaItem extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/MediaItem";
  static final java.lang.String _DEFINITION = "## Service call\n## see XBMC structure or Isod\n\nint32 mediaid\nMediaType mediatype\nstring data";
  int getMediaid();
  void setMediaid(int value);
  media_msgs.MediaType getMediatype();
  void setMediatype(media_msgs.MediaType value);
  java.lang.String getData();
  void setData(java.lang.String value);
}
