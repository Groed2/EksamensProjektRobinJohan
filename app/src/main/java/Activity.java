import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Activity")
public class Activity {
    @PrimaryKey(autoGenerate = true)
    private int mActivityId;
    @ColumnInfo (name = "Activity")
    private String mActivtyName;
    @ColumnInfo (name = "TimesPrWeek")
    private int mTimesPrWeek;
    @ColumnInfo (name = "Repeating")
    private boolean mRepeating;
    public Activity(@NonNull String Activity, @NonNull int timesprweek, @NonNull boolean repeating)
    {
        this.mActivtyName = Activity;
        this.mTimesPrWeek = timesprweek;
        this.mRepeating = repeating;
    }

    public String getmActivtyName() {
        return mActivtyName;
    }

    public int getmTimesPrWeek() {
        return mTimesPrWeek;
    }

    public int getmActivityId() {
        return mActivityId;
    }
}
