package media_msgs;

public interface MediaType extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/MediaType";
  static final java.lang.String _DEFINITION = "## Service call\n## see XBMC structure or Isod\n\nstring value\n\nstring UNKNOW=unknow\nstring VIDEO_MOVIE=movie\nstring VIDEO_TVSHOW=tvshow\nstring VIDEO_TVSHOW_EPISODE=episode\nstring AUDIO_SONG=song\nstring AUDIO_ALBUM=album";
  static final java.lang.String UNKNOW = "unknow";
  static final java.lang.String VIDEO_MOVIE = "movie";
  static final java.lang.String VIDEO_TVSHOW = "tvshow";
  static final java.lang.String VIDEO_TVSHOW_EPISODE = "episode";
  static final java.lang.String AUDIO_SONG = "song";
  static final java.lang.String AUDIO_ALBUM = "album";
  java.lang.String getValue();
  void setValue(java.lang.String value);
}
