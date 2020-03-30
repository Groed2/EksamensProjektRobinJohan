import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "onetime_table")
public class oneTimeThings {

    @PrimaryKey(autoGenerate = true)
    private int oneTimeID;


    @ColumnInfo (name = "InitialWeight")
    private float mInitWeight;
    @ColumnInfo
    private float mHeight;
    @ColumnInfo
    private Date mInitDate;

    // constructor for 1time things, takes weight, height and date as variables
    public oneTimeThings(@NonNull float initWeight,@NonNull float Height,@NonNull Date initialDate)
    {
        this.mHeight = Height;
        this.mInitDate = initialDate;
        this.mInitWeight = initWeight;

    }

    public Date getmInitDate() {
        return mInitDate;
    }

    public float getmHeight() {
        return mHeight;
    }

    public float getmInitWeight() {
        return this.mInitWeight;
    }

    public int getOneTimeID() {
        return this.oneTimeID;
    }
}
