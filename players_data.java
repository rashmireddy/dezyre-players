// ORM class for table 'players_data'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 18 16:28:49 PST 2014
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class players_data extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer player_id;
  public Integer get_player_id() {
    return player_id;
  }
  public void set_player_id(Integer player_id) {
    this.player_id = player_id;
  }
  public players_data with_player_id(Integer player_id) {
    this.player_id = player_id;
    return this;
  }
  private Long runs_scored;
  public Long get_runs_scored() {
    return runs_scored;
  }
  public void set_runs_scored(Long runs_scored) {
    this.runs_scored = runs_scored;
  }
  public players_data with_runs_scored(Long runs_scored) {
    this.runs_scored = runs_scored;
    return this;
  }
  private Long balls_played;
  public Long get_balls_played() {
    return balls_played;
  }
  public void set_balls_played(Long balls_played) {
    this.balls_played = balls_played;
  }
  public players_data with_balls_played(Long balls_played) {
    this.balls_played = balls_played;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof players_data)) {
      return false;
    }
    players_data that = (players_data) o;
    boolean equal = true;
    equal = equal && (this.player_id == null ? that.player_id == null : this.player_id.equals(that.player_id));
    equal = equal && (this.runs_scored == null ? that.runs_scored == null : this.runs_scored.equals(that.runs_scored));
    equal = equal && (this.balls_played == null ? that.balls_played == null : this.balls_played.equals(that.balls_played));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof players_data)) {
      return false;
    }
    players_data that = (players_data) o;
    boolean equal = true;
    equal = equal && (this.player_id == null ? that.player_id == null : this.player_id.equals(that.player_id));
    equal = equal && (this.runs_scored == null ? that.runs_scored == null : this.runs_scored.equals(that.runs_scored));
    equal = equal && (this.balls_played == null ? that.balls_played == null : this.balls_played.equals(that.balls_played));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.player_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.runs_scored = JdbcWritableBridge.readLong(2, __dbResults);
    this.balls_played = JdbcWritableBridge.readLong(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.player_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.runs_scored = JdbcWritableBridge.readLong(2, __dbResults);
    this.balls_played = JdbcWritableBridge.readLong(3, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(player_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(runs_scored, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(balls_played, 3 + __off, -5, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(player_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(runs_scored, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(balls_played, 3 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.player_id = null;
    } else {
    this.player_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.runs_scored = null;
    } else {
    this.runs_scored = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.balls_played = null;
    } else {
    this.balls_played = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.player_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.player_id);
    }
    if (null == this.runs_scored) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.runs_scored);
    }
    if (null == this.balls_played) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.balls_played);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.player_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.player_id);
    }
    if (null == this.runs_scored) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.runs_scored);
    }
    if (null == this.balls_played) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.balls_played);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(player_id==null?"null":"" + player_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(runs_scored==null?"null":"" + runs_scored, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balls_played==null?"null":"" + balls_played, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(player_id==null?"null":"" + player_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(runs_scored==null?"null":"" + runs_scored, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balls_played==null?"null":"" + balls_played, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.player_id = null; } else {
      this.player_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.runs_scored = null; } else {
      this.runs_scored = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.balls_played = null; } else {
      this.balls_played = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.player_id = null; } else {
      this.player_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.runs_scored = null; } else {
      this.runs_scored = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.balls_played = null; } else {
      this.balls_played = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    players_data o = (players_data) super.clone();
    return o;
  }

  public void clone0(players_data o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("player_id", this.player_id);
    __sqoop$field_map.put("runs_scored", this.runs_scored);
    __sqoop$field_map.put("balls_played", this.balls_played);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("player_id", this.player_id);
    __sqoop$field_map.put("runs_scored", this.runs_scored);
    __sqoop$field_map.put("balls_played", this.balls_played);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("player_id".equals(__fieldName)) {
      this.player_id = (Integer) __fieldVal;
    }
    else    if ("runs_scored".equals(__fieldName)) {
      this.runs_scored = (Long) __fieldVal;
    }
    else    if ("balls_played".equals(__fieldName)) {
      this.balls_played = (Long) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("player_id".equals(__fieldName)) {
      this.player_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("runs_scored".equals(__fieldName)) {
      this.runs_scored = (Long) __fieldVal;
      return true;
    }
    else    if ("balls_played".equals(__fieldName)) {
      this.balls_played = (Long) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
