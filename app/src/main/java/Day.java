import androidx.annotation.NonNull;
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

    Day(float BMI, Date date)
    {
        this.mBMI = BMI;
        this.mdate = date;
    }

    public Date getMdate() {
        return mdate;
    }

    public float getmBMI() {
        return mBMI;
    }

    public int getDayId() {
        return dayId;
    }
}
