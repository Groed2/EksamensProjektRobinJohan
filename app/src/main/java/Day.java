import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "Day_table")
public class Day {
    @PrimaryKey(autoGenerate = true)
    private  int dayId;
    @ColumnInfo
    private Date mdate;
    @ColumnInfo (name = "BMI")
    private float mBMI;
}
