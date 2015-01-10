package media_msgs;

public interface MediaGetItemsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/MediaGetItemsResponse";
  static final java.lang.String _DEFINITION = "MediaItem[] items";
  java.util.List<media_msgs.MediaItem> getItems();
  void setItems(java.util.List<media_msgs.MediaItem> value);
}
